package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/5/21  20:57
 */
public class 移除链表元素 {

    public static void main(String[] args) {

        // 1,2,6,3,4,5,6
        // val=6
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        //printNode2(head);

        ListNode listNode = new Solution().removeElements(head, 6);
        printNode2(listNode);

    }


    public static class Solution {

        public ListNode removeElements(ListNode head, int val) {

            if (null == head) {
                return null;
            }

            //dummy->1->2->3->4
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode cur = head;
            ListNode pre = dummy;

            while (cur != null) {
                if (cur.val == val) {
                    pre.next = cur.next;
                } else {
                    pre = cur;
                }
                cur = cur.next;

            }
            return dummy.next;
        }
    }


    private static void printNode(ListNode node) {

        ListNode n = node;
        if (n == null) {
            return;
        }
        System.out.println(n.val);
        printNode(n.next);

    }

    private static void printNode2(ListNode node) {

        ListNode n = node;
        if (n == null) {
            return;
        }

        do {
            System.out.println(n.val);
        } while (null != (n = n.next));

    }

    public static class ListNode {
        // 结点的值
        int val;

        // 下一个结点
        ListNode next;

        // 节点的构造函数(无参)
        public ListNode() {
        }

        // 节点的构造函数(有一个参数)
        public ListNode(int val) {
            this.val = val;
        }

        // 节点的构造函数(有两个参数)
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

