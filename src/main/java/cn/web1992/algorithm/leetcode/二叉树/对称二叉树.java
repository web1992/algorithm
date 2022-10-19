package cn.web1992.algorithm.leetcode.二叉树;

import cn.web1992.algorithm.leetcode.TreeNode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn7ihv/}
 */
public class 对称二叉树 {

    public static void main(String[] args) {

    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    static class Solution {
        public boolean isSymmetric(TreeNode root) {

            if (root == null) {
                return true;
            }
            return isSymmetric0(root.left, root.right);
        }

        public boolean isSymmetric0(TreeNode left, TreeNode right) {
            if (left != null && right == null) {
                return false;
            }
            if (left == null && right != null) {
                return false;
            }
            if (left == null && right == null) {
                return true;
            }
            if (left.val != right.val) {
                return false;
            }

            boolean leftOk = isSymmetric0(left.left, right.right);
            boolean rightOk = isSymmetric0(left.right, right.left);

            return leftOk && rightOk;
        }
    }
}
