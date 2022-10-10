package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnnbp2/}
 */
public class 合并两个有序链表 {

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

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode l1 = list1;
            ListNode l2 = list2;

            ListNode head = new ListNode(-1);
            ListNode cur = head;

            // 1 - 2 - 3
            // 1 - 3 - 4
            while (l1 != null && l2 != null) {

                if (l1.val > l2.val) {
                    cur.next = l2;
                    l2 = l2.next;
                } else {
                    cur.next = l1;
                    l1 = l1.next;
                }

                cur = cur.next;

            }
            cur.next = l1 == null ? l2 : l1;

            return head.next;
        }

    }

}
