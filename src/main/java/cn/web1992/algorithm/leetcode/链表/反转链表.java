package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnnhm6/}
 */
public class 反转链表 {
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

        //   1 -> 3 -> 5 -> 7
        public ListNode reverseList(ListNode head) {

            ListNode dummy = null;
            ListNode cur = head;
            ListNode next = null;

            while (cur != null) {
                next = cur.next;
                cur.next = dummy;

                dummy = cur;
                cur = next;
            }

            return dummy;
        }
    }


}
