package cn.web1992.algorithm.leetcode;


/**
 * @link {https://leetcode.cn/problems/search-in-a-binary-search-tree/}
 */
public class 二叉搜索树中的搜索 {

    public static void main(String[] args) {


    }


    static class Solution {

        public TreeNode searchBST(TreeNode root, int val) {
            if (null == root) {
                return null;
            }

            TreeNode temp = root;
            if (temp.val == val) {
                return temp;
            }

            temp = root.left;
            temp = searchBST(temp, val);
            if (null != temp) {
                return temp;
            }
            temp = root.right;
            temp = searchBST(temp, val);
            return temp;
        }
    }
}
