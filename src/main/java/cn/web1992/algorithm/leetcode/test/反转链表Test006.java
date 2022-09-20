package cn.web1992.algorithm.leetcode.test;

import cn.web1992.algorithm.leetcode.ListNode;

/**
 * @author web1992
 * @date 2022/2/25  11:16 下午
 * @implNote 反转链表
 * @link {https://www.bilibili.com/video/BV1JS4y1Z7Lu}
 * @link {https://www.bilibili.com/video/BV1VL411u7TK}
 * @link {https://leetcode.cn/problems/reverse-linked-list/}
 */
public class 反转链表Test006 {

    public static void main(String[] args) {

        ListNode node = init();

        node.print();
        // 反转
        new Solution().reverseList(node).print();

    }

    // [1->2->3->4->5]
    static class Solution {

        public ListNode reverseList(ListNode head) {

            ListNode temp = null;
            ListNode cur = head;
            ListNode next = null;

            while (cur != null) {
                next = cur.next;
                cur.next = temp;

                temp = cur;
                cur = next;

            }

            return temp;
        }
    }

    private static ListNode init() {
        ListNode node1 = new ListNode(1);


        ListNode node2 = new ListNode(2);
        node1.next = node2;

        ListNode node3 = new ListNode(3);
        node2.next = node3;

        ListNode node4 = new ListNode(4);
        node3.next = node4;

        ListNode node5 = new ListNode(5);
        node4.next = node5;

        return node1;
    }

    static public class Node {
        int val;
        Node next;


    }

}
