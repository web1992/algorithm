package cn.web1992.algorithm.leetcode;


/**
 * @link {https://leetcode.cn/problems/maximum-depth-of-binary-tree/}
 * @link {https://programmercarl.com/0104.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%9C%80%E5%A4%A7%E6%B7%B1%E5%BA%A6.html#%E9%80%92%E5%BD%92%E6%B3%95}
 */
public class 二叉树的最大深度_递归 {

    class Solution {


        public int maxDepth(TreeNode root) {
            return getHeight(root);
        }

        public int getHeight(TreeNode root) {
            if (null == root) {
                return 0;
            }
            int leftH = getHeight(root.left);
            int rightH = getHeight(root.right);

            return Math.max(leftH, rightH) + 1;
        }
    }


}
