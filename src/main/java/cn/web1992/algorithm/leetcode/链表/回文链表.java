package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

/**
 * @author web1992
 * @date 2022/10/13  17:45
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnv1oc/}
 */
public class 回文链表 {
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

        // 1 2 3 4
        // 1 2 3
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            if (fast != null) {
                slow = slow.next;
            }

            slow = reverse(slow);
            fast = head;
            while (slow != null) {

                if (slow.val != fast.val) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next;
            }

            return true;
        }


        public ListNode reverse(ListNode head) {

            ListNode pre = null;
            while (head != null) {
                ListNode next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }

            return pre;
        }
    }
}
