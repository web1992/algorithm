package cn.web1992.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/minimum-depth-of-binary-tree/}
 * @link {https://programmercarl.com/0111.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%9C%80%E5%B0%8F%E6%B7%B1%E5%BA%A6.html}
 */
public class 二叉树的最小深度 {

    class Solution {

        public int minDepth(TreeNode root) {

            int depth = 0;
            if (null == root) {
                return depth;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {

                int len = queue.size();
                depth++;

                while (len > 0) {
                    TreeNode node = queue.poll();
                    if (node.right == null && node.left == null) {
                        return depth;
                    }
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }

                    len--;
                }

            }

            return depth;
        }

    }

}
