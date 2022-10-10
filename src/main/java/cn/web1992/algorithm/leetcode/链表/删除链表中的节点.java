package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnarn7/}
 */
public class 删除链表中的节点 {

    public static void main(String[] args) {

    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
        public void deleteNode(ListNode node) {

            node.val = node.next.val;
            node.next = node.next.next;

        }
    }
}
