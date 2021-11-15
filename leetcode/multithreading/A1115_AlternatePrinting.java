package leetcode.multithreading;

import java.util.concurrent.*;

/**
 * @author Wangmingcan
 * @date 2021/11/15 9:22
 * @description 交替打印FooBar
 */
public class A1115_AlternatePrinting {
    public static void main(String[] args) {
        FooBar fooBar = new FooBar(10);//打印10次foo bar
        Runnable printFoo = () -> {
            System.out.printf("%s\n", "foo");
        };
        Runnable printBar = () -> {
            System.out.printf("%s\n", "bar");
        };
        Thread fooThread = new Thread(() -> {
            try {
                fooBar.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread barThread = new Thread(() -> {
            try {
                fooBar.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        fooThread.start();
        barThread.start();
    }

    /**
     * Semaphore
     */
    static class FooBar {
        private int n;
        public Semaphore semaphoreFoo = new Semaphore(1);
        public Semaphore semaphoreBar = new Semaphore(0);
        public FooBar(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                semaphoreBar.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                semaphoreBar.release();
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                semaphoreBar.acquire();
                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();
                semaphoreFoo.release();
            }
        }
    }

    /**
     * CyclicBarrier + 变量控制
     */
    static class FooBar_2 {
        private int n;

        private CyclicBarrier cb = new CyclicBarrier(2);
        private volatile boolean fooExec = true;

        public FooBar_2(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                while (!fooExec) {
                    //false的时候，bar线程在执行，foo线程在这此处空转
                }
                printFoo.run();//打印foo
                fooExec = false;//设置变量
                try {
                    cb.await();//线程foo到达同步点
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                try {
                    cb.await();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
                printBar.run();
                fooExec = true;
            }
        }
    }

    /**
     * Thread.yield() + 变量控制 (不加Thread.yield()会超时)
     */
    static class FooBar_3 {
        private int n;

        private volatile boolean fooExec = true;

        public FooBar_3(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n;) {
                if (fooExec) {
                    printFoo.run();
                    fooExec = false;
                    i++;
                } else {
                    Thread.yield();
                }
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n;) {
                if (!fooExec) {
                    printBar.run();
                    fooExec = true;
                    i++;
                } else {
                    Thread.yield();
                }
            }
        }
    }

    /**
     * BlockingQueue
     */
    static class FooBar_4 {
        private int n;
        private BlockingQueue<Integer> fooQueue = new LinkedBlockingQueue<Integer>() {{
            add(0);
        }};
        private BlockingQueue<Integer> barQueue = new LinkedBlockingQueue<>();

        public FooBar_4(int n) {
            this.n = n;
        }

        public void foo(Runnable printFoo) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                fooQueue.take();
                printFoo.run();
                barQueue.add(0);
            }
        }

        public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                barQueue.take();
                printBar.run();
                fooQueue.add(0);
            }
        }
    }
}
