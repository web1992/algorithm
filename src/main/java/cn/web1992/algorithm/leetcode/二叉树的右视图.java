package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/binary-tree-right-side-view/}
 * @link {https://programmercarl.com/0102.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.html#_199-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%8F%B3%E8%A7%86%E5%9B%BE}
 */
public class 二叉树的右视图 {

    class Solution {

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();

            if (root == null) {
                return ans;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {

                int len = queue.size();

                for (int i = 0; i < len; i++) {

                    TreeNode _node = queue.poll();

                    if (_node.left != null) {
                        queue.offer(_node.left);
                    }

                    if (_node.right != null) {
                        queue.offer(_node.right);
                    }
                    // 只取最后一个
                    if (i == len - 1) {
                        ans.add(_node.val);
                    }
                }

            }

            return ans;
        }
    }

}
