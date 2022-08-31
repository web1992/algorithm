package cn.web1992.algorithm.leetcode;

/**
 * @link {https://programmercarl.com/0101.%E5%AF%B9%E7%A7%B0%E4%BA%8C%E5%8F%89%E6%A0%91.html#%E9%80%92%E5%BD%92%E6%B3%95}
 * @link {https://leetcode.cn/problems/symmetric-tree/}
 */
public class 对称二叉树 {


    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        TreeNode root = TreeNode.build(arr);

    }

    static class Solution {

        public boolean isSymmetric(TreeNode root) {
            return compare(root.left, root.right);
        }


        public boolean compare(TreeNode left, TreeNode right) {
            if (left == null && right != null) {
                return false;
            } else if (left != null && right == null) {
                return false;
            } else if (null == left && null == right) {
                return true;
            } else if (left.val != right.val) {
                return false;
            }

            boolean c1 = compare(left.left, right.right);
            boolean c2 = compare(left.right, right.left);

            return c1 && c2;
        }
    }

}
