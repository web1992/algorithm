package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/1  08:59
 * @link {https://leetcode.cn/problems/add-two-numbers/}
 */
public class 两数相加 {

    public static void main(String[] args) {

        new Solution().addTwoNumbers(null, null);
    }

    static class Solution {

        // 1->3->5
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode temp = new ListNode(0);
            // 新的链表
            ListNode cur = temp;

            int carry = 0;

            while (l1 != null || l2 != null) {

                int val1 = l1 == null ? 0 : l1.val;
                int val2 = l2 == null ? 0 : l2.val;

                int sum = val1 + val2 + carry;
                carry = sum / 10;
                sum = sum % 10;

                cur.next = new ListNode(sum);
                cur = cur.next;

                // 如果l1,l2 不为空，则这个值会被覆盖。为空，则会在链表末尾加新的节点
                if (carry == 1) {
                    cur.next = new ListNode(1);
                }

                if (l1 != null) {
                    l1 = l1.next;
                }

                if (l2 != null) {
                    l2 = l2.next;
                }
            }

            return temp.next;

        }
    }
}


