package leetcode.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

/**
 * @author Wangmingcan
 * @date 2021/11/15 11:02
 * @description
 */
public class A1116_ZeroEvenOdd {
    public static void main(String[] args) {

    }

    /**
     * Semaphore
     */
    class ZeroEvenOdd {
        private int n;

        private Semaphore zeroSema = new Semaphore(1);
        private Semaphore oddSema = new Semaphore(0);
        private Semaphore evenSema = new Semaphore(0);

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                zeroSema.acquire();
                printNumber.accept(0);
                if (i % 2 == 1) {
                    oddSema.release();
                } else {
                    evenSema.release();
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    evenSema.acquire();
                    printNumber.accept(i);
                    zeroSema.release();
                }
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    oddSema.acquire();
                    printNumber.accept(i);
                    zeroSema.release();
                }
            }
        }
    }

    /**
     * CountDownLatch（不断new新的）
     */
    class ZeroEvenOdd_2 {
        private int n;

        private CountDownLatch zeroLatch = new CountDownLatch(0);
        private CountDownLatch evenLatch = new CountDownLatch(1);//偶数
        private CountDownLatch oddLatch = new CountDownLatch(1);//奇数

        public ZeroEvenOdd_2(int n) {
            this.n = n;
        }

        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                zeroLatch.await();
                printNumber.accept(0);
                zeroLatch = new CountDownLatch(1);
                if (i % 2 == 1) {
                    oddLatch.countDown();
                } else {
                    evenLatch.countDown();
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    evenLatch.await();
                    printNumber.accept(i);
                    evenLatch = new CountDownLatch(1);
                    zeroLatch.countDown();
                }
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    oddLatch.await();
                    printNumber.accept(i);
                    oddLatch = new CountDownLatch(1);
                    zeroLatch.countDown();
                }
            }
        }
    }

    /**
     * AtomicInteger + Thread.yield()
     */
    class ZeroEvenOdd_3 {
        private int n;
        private AtomicInteger ai = new AtomicInteger(0);

        public ZeroEvenOdd_3(int n) {
            this.n = n;
        }

        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                while (ai.get() != 0 && ai.get() != 2) {
                    Thread.yield();
                }
                printNumber.accept(0);
                ai.incrementAndGet();
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i += 2) {
                while (ai.get() != 3) {
                    Thread.yield();
                }
                printNumber.accept(i);
                ai.set(0);
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i += 2) {
                while (ai.get() != 1) {
                    Thread.yield();
                }
                printNumber.accept(i);
                ai.set(2);
            }
        }
    }

    /**
     * ReentrantLock+Condition
     */
    class ZeroEvenOdd_4 {
        private int n;

        private volatile int start = 1;

        private volatile int state;
        private Lock lock = new ReentrantLock();
        private Condition zero = lock.newCondition();
        private Condition even = lock.newCondition();
        private Condition odd = lock.newCondition();

        public ZeroEvenOdd_4(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            lock.lock();
            try {
                while (start <= n) {
                    if (state != 0) {
                        zero.await();
                    }
                    printNumber.accept(0);
                    if (start % 2 == 0) {
                        state = 2;
                        even.signal();
                    } else {
                        state = 1;
                        odd.signal();
                    }
                    zero.await();
                }
                odd.signal();
                even.signal();
            } finally {
                lock.unlock();
            }
        }

        //偶数
        public void even(IntConsumer printNumber) throws InterruptedException {
            lock.lock();
            try {
                while (start <= n) {
                    if (state != 2) {
                        even.await();
                    } else {
                        printNumber.accept(start++);
                        state = 0;
                        zero.signal();
                    }
                }
            } finally {
                lock.unlock();
            }
        }

        //基数
        public void odd(IntConsumer printNumber) throws InterruptedException {
            lock.lock();
            try {
                while (start <= n) {
                    if (state != 1) {
                        odd.await();
                    } else {
                        printNumber.accept(start++);
                        state = 0;
                        zero.signal();
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

    /**
     * 变量 + Thread.yield();
     */
    class ZeroEvenOdd_5 {

        private int n;

        private volatile int state;

        public ZeroEvenOdd_5(int n) {
            this.n = n;
        }

        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                while (state != 0) {
                    Thread.yield();
                }
                printNumber.accept(0);
                if (i % 2 == 1) {
                    state = 1;
                } else {
                    state = 2;
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i += 2) {
                while (state != 2) {
                    Thread.yield();
                }
                printNumber.accept(i);
                state = 0;
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i += 2) {
                while (state != 1) {
                    Thread.yield();
                }
                printNumber.accept(i);
                state = 0;
            }
        }
    }
}
