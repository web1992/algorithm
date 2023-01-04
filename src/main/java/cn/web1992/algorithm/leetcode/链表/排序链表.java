package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

import java.util.PriorityQueue;

/**
 * @author web1992
 * @date 2023/1/4  13:53
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xa262d/}
 */
public class 排序链表 {


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
    class Solution {

        public ListNode sortList(ListNode head) {

            PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> {
                return a.val - b.val;
            });

            ListNode n1 = head;
            while (n1 != null) {
                queue.add(n1);
                n1 = n1.next;
            }

            ListNode hh = new ListNode(-1);
            ListNode t = hh;
            while (!queue.isEmpty()) {
                hh.next = new ListNode(queue.poll().val);
                hh = hh.next;
            }

            return t.next;
        }
    }
}
