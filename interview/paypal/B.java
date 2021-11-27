package interview.paypal;

import acm.exam.D;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wangmingcan
 * @date 2021/11/26 16:07
 * @description
 */
public class B {

    class LRUCache {

        class DLinkedNode {
            String key;
            String value;
            DLinkedNode prev;
            DLinkedNode next;
            DLinkedNode() {}
            DLinkedNode(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }

        private Map<String, DLinkedNode> cache = new HashMap<>();
        private int size;
        private int capacity;
        private DLinkedNode head;
        private DLinkedNode tail;

        LRUCache (int capacity) {
            this.capacity = capacity;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.prev = head;
        }

        /**
         * 获取
         */
        public String get(String key) {
            DLinkedNode node = cache.get(key);
            if (node != null) {
                moveToHead(node);
                return node.value;
            }
            return null;
        }

        /**
         * 存入
         */
        public void put(String key, String value) {
            DLinkedNode node = cache.get(key);
            if (node != null) {
                cache.put(key, node);
                moveToHead(node);
            }else {
                DLinkedNode newNode = new DLinkedNode(key, value);
                if (size == capacity) {
                    removeNode(tail.prev);
                    size--;
                }
                addToHead(newNode);
                size++;
            }
        }

        private void moveToHead(DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        private void addToHead(DLinkedNode node) {
            node.next = head.next;
            node.prev = head;
            node.next.prev = node;
            head.next = node;
            cache.put(node.key, node);
        }

        private void removeNode(DLinkedNode node) {
            node.next.prev = node.prev;
            node.prev.next = node.next;
            cache.remove(node.key);
        }
    }
}
