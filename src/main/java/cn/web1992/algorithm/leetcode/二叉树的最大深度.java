package cn.web1992.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/maximum-depth-of-binary-tree/}
 */
public class 二叉树的最大深度 {
    class Solution {


        public int maxDepth(TreeNode root) {

            int depth = 0;
            if (null == root) {
                return depth;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int len = queue.size();

                while (len > 0) {

                    TreeNode node = queue.poll();
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }

                    len--;
                }
                depth++;
            }

            return depth;
        }
    }


}
