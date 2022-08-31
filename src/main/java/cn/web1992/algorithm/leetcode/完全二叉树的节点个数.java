package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/count-complete-tree-nodes/}
 * @link {https://programmercarl.com/0222.%E5%AE%8C%E5%85%A8%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E8%8A%82%E7%82%B9%E4%B8%AA%E6%95%B0.html#_222-%E5%AE%8C%E5%85%A8%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E8%8A%82%E7%82%B9%E4%B8%AA%E6%95%B0}
 */
public class 完全二叉树的节点个数 {


    class Solution {

        public int countNodes(TreeNode root) {

            if (null == root) {
                return 0;
            }

            return countNodes(root.left) + countNodes(root.right) + 1;
        }


        public int countNodes2(TreeNode root) {

            int nodes = 0;

            return nodes;
        }
    }

}
