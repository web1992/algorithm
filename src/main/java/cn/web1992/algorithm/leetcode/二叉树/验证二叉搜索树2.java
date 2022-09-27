package cn.web1992.algorithm.leetcode.二叉树;

import cn.web1992.algorithm.leetcode.TreeNode;

/**
 * @link {https://leetcode.cn/problems/validate-binary-search-tree/}
 * @link {https://programmercarl.com/0098.%E9%AA%8C%E8%AF%81%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91.html}
 */
public class 验证二叉搜索树2 {

    public static void main(String[] args) {

    }


    class Solution {

        private TreeNode max = null;

        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }

            return isValidBST0(root);
        }

        public boolean isValidBST0(TreeNode root) {

            if (root == null) {
                return true;
            }
            boolean left = isValidBST0(root.left);
            if (!left) {
                return false;
            }
            if (max != null && max.val >= root.val) {
                return false;
            }

            max = root;
            boolean right = isValidBST0(root.right);

            return left && right;
        }


    }
}
