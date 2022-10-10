package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn2925/}
 */
public class 删除链表的倒数第N个节点2 {

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

        // 1->2->3->4->5
        // 快慢指针
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode slow = head;
            ListNode fast = head;

            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }
            if (fast == null) {
                return head.next;
            }

            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;

            return head;
        }


    }
}
