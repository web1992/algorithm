package cn.web1992.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/populating-next-right-pointers-in-each-node-ii/}
 */
public class 填充每个节点的下一个右侧节点指针II {

    class Solution {


        public Node connect(Node root) {

            if (null == root) {
                return null;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int len = queue.size();
                // 同一层的节点

                Node pre = null;
                Node node = null;
                for (int i = 0; i < len; i++) {

                    if (i == 0) {
                        node = pre = queue.poll();
                    } else {
                        node = queue.poll();
                        pre.next = node;
                        pre = node;
                    }

                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }


            }
            return root;
        }

        class Node {
            public int val;
            public Node left;
            public Node right;
            public Node next;

            public Node() {
            }

            public Node(int _val) {
                val = _val;
            }

            public Node(int _val, Node _left, Node _right, Node _next) {
                val = _val;
                left = _left;
                right = _right;
                next = _next;
            }
        }

        ;

    }

}
