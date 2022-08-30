package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/}
 * @link {https://programmercarl.com/0102.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.html#_116-%E5%A1%AB%E5%85%85%E6%AF%8F%E4%B8%AA%E8%8A%82%E7%82%B9%E7%9A%84%E4%B8%8B%E4%B8%80%E4%B8%AA%E5%8F%B3%E4%BE%A7%E8%8A%82%E7%82%B9%E6%8C%87%E9%92%88}
 */
public class 填充每个节点的下一个右侧节点指针 {

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
                List<Node> tempList = new ArrayList<>();
                while (len > 0) {
                    Node node = queue.poll();
                    tempList.add(node);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }

                    len--;
                }

                // 更新 left 指针
                Node t = tempList.get(0);
                for (int i = 1; i < tempList.size(); i++) {
                    t.next = tempList.get(i);
                    t = tempList.get(i);
                }

            }
            return root;
        }

    }

    // Definition for a Node.
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

}
