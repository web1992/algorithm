package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/average-of-levels-in-binary-tree/}
 * @link {https://programmercarl.com/0102.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.html#_637-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%B9%B3%E5%9D%87%E5%80%BC}
 */
public class 二叉树的层平均值 {

    class Solution {

        public List<Double> averageOfLevels(TreeNode root) {

            List<Double> ans = new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int len = queue.size();

                List<Integer> _list = new ArrayList<>();
                while (len > 0) {

                    TreeNode _node = queue.poll();
                    _list.add(_node.val);

                    if (_node.left != null) {
                        queue.offer(_node.left);
                    }

                    if (_node.right != null) {
                        queue.offer(_node.right);
                    }

                    len--;
                }

                ans.add(_list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());
            }


            return ans;
        }
    }
}
