package cn.web1992.algorithm.leetcode.test;

import cn.web1992.algorithm.leetcode.ListNode;

public class 两数相加Test01 {

    public static void main(String[] args) {
        new Solution().addTwoNumbers(null, null);
    }

    static class Solution {

        /**
         * 输入：l1 = [2,4,3], l2 = [5,6,4]
         * 输出：[7,0,8]
         * 解释：342 + 465 = 807.
         *
         * @param l1 链表1
         * @param l2 链表2
         * @return
         */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int num = 0;

            ListNode head = new ListNode(-1);
            ListNode temp = head;
            head.next = temp;

            ListNode temp1 = l1;
            ListNode temp2 = l2;
            while (temp1 != null || temp2 != null) {

                int val1 = temp1 == null ? 0 : temp1.val;
                int val2 = temp2 == null ? 0 : temp2.val;
                int result = val1 + val2 + num;
                num = result / 10;
                result = result % 10;
                ListNode t = new ListNode(result);
                temp.next = t;
                temp = t;

                if (temp1 != null) {
                    temp1 = temp1.next;
                }
                if (temp2 != null) {
                    temp2 = temp2.next;
                }
            }

            if (num > 0) {
                temp.next = new ListNode(num);
            }

            return head.next;

        }
    }
}
