package codetop;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Wangmingcan
 * @date 2021/8/21 9:18
 * @description LRU 缓存机制 (哈希表 + 双向链表)，不使用Java封装好的LinkedHashMap
 */
public class A146 {
    public static void main(String[] args) {

    }

    class LRUCache {

        class DLinkedNode {
            int key;
            int value;
            DLinkedNode prev;
            DLinkedNode next;
            DLinkedNode() {}
            DLinkedNode(int _key, int _value) {
                key = _key;
                value = _value;
            }
        }

        private Map<Integer, DLinkedNode> cache = new HashMap<>();
        private int size;
        private int capacity;
        private DLinkedNode head, tail;

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            // 使用伪头部和伪尾部节点
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                return -1;
            }
            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = cache.get(key);
            if (node == null) {
                if (size >= capacity) {
                    removeTail();
                    size--;
                }
                addToHead(new DLinkedNode(key, value));
                size++;
            }else {
                node.value = value;
                moveToHead(node);
            }
        }

        private void addToHead(DLinkedNode node) {
            node.prev = head;
            node.next = head.next;
            node.next.prev = node;
            head.next = node;
            cache.put(node.key, node);
        }

        private void moveToHead(DLinkedNode node) {
            removeNode(node);
            addToHead(node);
        }

        private void removeTail() {
            removeNode(tail.prev);
        }

        private void removeNode(DLinkedNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            cache.remove(node.key);
        }
    }
}