package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/binary-tree-level-order-traversal/}
 * @link {https://programmercarl.com/0102.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.html}
 */
public class 二叉树的层序遍历 {

    class Solution {

        List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> levelOrder(TreeNode root) {

            if (null == root) {
                return ans;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {

                int len = queue.size();

                List<Integer> item = new ArrayList<>();

                while (len > 0) {

                    TreeNode node = queue.poll();
                    item.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                    len--;
                }

                ans.add(item);
            }

            return ans;
        }
    }

}
