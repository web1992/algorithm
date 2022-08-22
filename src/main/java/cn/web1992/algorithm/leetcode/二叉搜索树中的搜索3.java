package cn.web1992.algorithm.leetcode;


/**
 * @link {https://leetcode.cn/problems/search-in-a-binary-search-tree/}
 */
public class 二叉搜索树中的搜索3 {

    public static void main(String[] args) {


    }


    static class Solution {

        /**
         * 迭代
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

            while (root != null) {

                if (root.val == val) {
                    return root;
                } else if (root.val > val) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }

            return null;

        }
    }
}
