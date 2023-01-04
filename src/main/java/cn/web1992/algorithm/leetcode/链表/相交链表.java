package cn.web1992.algorithm.leetcode.链表;

import cn.web1992.algorithm.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author web1992
 * @date 2023/1/4  09:33
 * @link {https://leetcode.cn/problems/intersection-of-two-linked-lists/}
 */
public class 相交链表 {

    public static void main(String[] args) {

    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            Set<ListNode> set = new HashSet<>();

            ListNode n1 = headA;
            ListNode n2 = headB;
            while (n1 != null) {
                set.add(n1);
                n1 = n1.next;
            }

            while (n2 != null) {
                if (set.contains(n2)) {
                    return n2;
                }
                n2 = n2.next;
            }

            return null;
        }

    }

}
