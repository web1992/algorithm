package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/binary-tree-level-order-traversal/}
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
