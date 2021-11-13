package leetcode.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Wangmingcan
 * @date 2021/11/13 19:49
 * @description 按序打印
 */
public class A1114 {

    public static void main(String[] args) {

    }

    /**
     *  变量控制
     */
    class Foo_1 {

        private volatile int flag = 1;

        public Foo_1() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printSecond.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            flag = 2;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (flag != 2);
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            flag = 3;
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (flag != 3);
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

    /**
     *  信号量控制
     */
    class Foo_2 {

        public Semaphore seam_first_two = new Semaphore(0);

        public Semaphore seam_two_second = new Semaphore(0);

        public Foo_2() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printSecond.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            seam_first_two.release();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            seam_first_two.acquire();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            seam_two_second.release();
        }

        public void third(Runnable printThird) throws InterruptedException {
            seam_two_second.acquire();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

    /**
     *  CountDownLatch控制
     */
    class Foo_3 {

        private CountDownLatch second = new CountDownLatch(1);
        private CountDownLatch third = new CountDownLatch(1);

        public Foo_3() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printSecond.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            second.countDown();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            second.await();
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            third.countDown();
        }

        public void third(Runnable printThird) throws InterruptedException {
            third.await();
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }

    /**
     *  原子类实现
     */
    class Foo_4 {

        private AtomicInteger firstJobDone = new AtomicInteger(0);
        private AtomicInteger secondJobDone = new AtomicInteger(0);

        public Foo_4() {}

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first".
            printFirst.run();
            // mark the first job as done, by increasing its count.
            firstJobDone.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (firstJobDone.get() != 1) {
                // waiting for the first job to be done.
            }
            // printSecond.run() outputs "second".
            printSecond.run();
            // mark the second as done, by increasing its count.
            secondJobDone.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (secondJobDone.get() != 1) {
                // waiting for the second job to be done.
            }
            // printThird.run() outputs "third".
            printThird.run();
        }
    }
}
