package cn.web1992.algorithm.leetcode;


/**
 * @link {https://leetcode.cn/problems/minimum-depth-of-binary-tree/}
 * @link {https://programmercarl.com/0111.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%9C%80%E5%B0%8F%E6%B7%B1%E5%BA%A6.html}
 */
public class 二叉树的最小深度_递归 {

    class Solution {

        public int minDepth(TreeNode root) {

            return getHeight(root);
        }

        private int getHeight(TreeNode root) {

            if (null == root) {
                return 0;
            }

            int leftH = getHeight(root.left);
            int rightH = getHeight(root.right);

            if (root.left != null && root.right == null) {
                return leftH + 1;
            }

            if (root.right != null && root.left == null) {
                return rightH + 1;
            }

            return Math.min(leftH, rightH) + 1;
        }

    }

}
