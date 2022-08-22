package cn.web1992.algorithm.leetcode;


/**
 * @link {https://leetcode.cn/problems/search-in-a-binary-search-tree/}
 */
public class 二叉搜索树中的搜索2 {

    public static void main(String[] args) {


    }


    static class Solution {

        /**
         * 递归
         * <p>
         * <p>
         * 10
         * /  \
         * 4    11
         *
         * @param root
         * @param val
         * @return
         */
        public TreeNode searchBST(TreeNode root, int val) {
            if (null == root || root.val == val) {
                return root;
            }

            if (root.val > val) {
                return searchBST(root.left, val);
            } else {
                return searchBST(root.right, val);
            }

        }
    }
}
