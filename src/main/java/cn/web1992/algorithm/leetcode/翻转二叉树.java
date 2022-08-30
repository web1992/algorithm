package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/invert-binary-tree/}
 * @link {https://programmercarl.com/0226.%E7%BF%BB%E8%BD%AC%E4%BA%8C%E5%8F%89%E6%A0%91.htm}
 */
public class 翻转二叉树 {

    public static void main(String[] args) {

    }


    static class Solution {
        public TreeNode invertTree(TreeNode root) {

            if (root == null) {
                return root;
            }

            swap(root);
            invertTree(root.right);
            invertTree(root.left);

            return root;
        }

        public void swap(TreeNode root) {
            TreeNode left = root.left;
            root.left = root.right;
            root.right = left;
        }

    }


}
