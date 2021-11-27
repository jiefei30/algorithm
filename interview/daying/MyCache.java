package interview.daying;

import acm.exam.E;

import java.util.*;
import java.util.concurrent.Semaphore;

/**
 * @author Wangmingcan
 * @date 2021/11/25 10:12
 * @description
 */
public class MyCache {
    public static void main(String[] args) {

    }


    class Cache {

        class DLinkedNode {
            String key;
            String value;
            DLinkedNode prev;
            DLinkedNode next;

            DLinkedNode() {
            }

            ;

            DLinkedNode(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }

        // 数据集
        private Map<String, DLinkedNode> cache = new HashMap<>();
        //过期数据集
        private Map<String, Long> expire = new HashMap<>();
        //阻塞查询数据集
        private Set<String> blockingCache = new HashSet<>();
        private int size;
        private int capacity;
        private DLinkedNode head, tail;
        private Semaphore semaphore = new Semaphore(1);

        public Cache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.prev = head;
            GC gc = new GC(cache, expire, semaphore);
            Thread deamonGC = new Thread(gc, "deamonGC");
            deamonGC.setDaemon(true);
            deamonGC.start();
        }

        public void put(String key, String value) throws InterruptedException {
            semaphore.acquire();
            put(key, value, -1L);
            semaphore.release();
        }

        public void put(String key, String value, Long seconds) throws InterruptedException {
            semaphore.acquire();
            DLinkedNode node = cache.get(key);
            if (node == null) {
                DLinkedNode newNode = new DLinkedNode(key, value);
            }
            semaphore.release();
        }

        public void expire(String key, Long seconds) {

        }

        public void get(String key) {

        }

        public void delete(String key) {

        }

        //加入头部
        private void addToHead(DLinkedNode node) {

        }

        //移动到头部
        private void moveToHead(DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        //扩容时使用，移除尾部
        private void removeTail() {
            removeNode(tail.prev);
        }

        //移除节点
        private void removeNode(DLinkedNode node) {

        }

        //持久化
        private void bgsave() {
            Thread rbd = new Thread(new RBD(), "save");
            rbd.start();
        }

        class RBD implements Runnable {
            @Override
            public void run() {

            }
        }

        class GC implements Runnable {

            private Map<String, DLinkedNode> cache;
            private Map<String, Long> expire;
            private long GCWaitTime = 60 * 1000;
            private Semaphore semaphore;

            public GC(Map<String, DLinkedNode> cache, Map<String, Long> expire, Semaphore semaphore) {
                this.cache = cache;
                this.expire = expire;
                this.semaphore = semaphore;
            }

            @Override
            public void run() {
                try {
                    for (; ; ) {
                        semaphore.acquire();
                        Long curTime = Calendar.getInstance().getTimeInMillis() / 1000;
                        for (Map.Entry<String, Long> entry : expire.entrySet()) {
                            if (entry.getValue() < curTime) {
                                delete(entry.getKey());
                            }
                        }
                        semaphore.release();
                        Thread.sleep(GCWaitTime);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void delete(String key) {

            }

            private void removeNode(DLinkedNode node) {

            }
        }
    }
}
