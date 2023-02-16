package cn.web1992.algorithm.leetcode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * @link {https://leetcode.cn/problems/balanced-binary-tree/}
 * @link {https://programmercarl.com/0110.%E5%B9%B3%E8%A1%A1%E4%BA%8C%E5%8F%89%E6%A0%91.html}
 */
public class 平衡二叉树 {

    class Solution {

        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }
            return getHeight(root) != -1;
        }

        public int getHeight(TreeNode node) {

            if (null == node) {
                return 0;
            }

            int leftH = getHeight(node.left);
            if (leftH == -1) {
                return -1;
            }

            int rightH = getHeight(node.right);
            if (rightH == -1) {
                return -1;
            }

            if (Math.abs(rightH - leftH) > 1) {
                return -1;
            } else {
                // 最大的高度+1
                return 1 + Math.max(rightH, leftH);
            }
        }
    }


}
