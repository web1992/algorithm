package cn.web1992.algorithm.leetcode.链表;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/leetbook/read/top-interview-questions/xam1wr/
 */
public class 复制带随机指针的链表 {


    /*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

    class Solution {

        // 利用 hashMap
        public Node copyRandomList(Node head) {

            Map<Node, Node> map = new HashMap<>();

            Node t = head;
            while (t != null) {
                Node node = new Node(t.val);
                map.put(t, node);
                t = t.next;
            }

            t = head;
            while (t != null) {
                map.get(t).next = map.get((t.next));
                map.get(t).random = map.get((t.random));
                t = t.next;
            }

            return map.get(head);
        }
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
