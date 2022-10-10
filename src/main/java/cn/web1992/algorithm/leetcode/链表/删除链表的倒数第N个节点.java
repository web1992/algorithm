package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn2925/}
 */
public class 删除链表的倒数第N个节点 {

    public static void main(String[] args) {

    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    static class Solution {

        // 链表的删除，需要注意头尾节点的处理
        public ListNode removeNthFromEnd(ListNode head, int n) {


            int len = len(head);
            if (len - n == 0) {// 删除的是头 节点
                return head.next;
            }
            ListNode t = head;
            ListNode p = head;
            for (int i = 0; i < len - n; i++) {
                p = t;
                t = t.next;
            }

            p.next = p.next.next;

            return head;
        }

        public int len(ListNode head) {

            int len = 0;
            while (head != null) {
                len++;
                head = head.next;
            }

            return len;
        }
    }
}
