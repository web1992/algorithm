package cn.web1992.algorithm.leetcode;

import cn.web1992.algorithm.leetcode.test.反转链表Test006;

/**
 * @author web1992
 * @date 2022/6/1  09:00
 */
public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void print() {
        ListNode n = this;
        StringBuilder sb = new StringBuilder("[");
        while (n != null) {
            sb.append(n.val);
            n = n.next;
            if (n != null) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}