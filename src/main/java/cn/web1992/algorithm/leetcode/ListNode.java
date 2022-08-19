package cn.web1992.algorithm.leetcode;

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
}