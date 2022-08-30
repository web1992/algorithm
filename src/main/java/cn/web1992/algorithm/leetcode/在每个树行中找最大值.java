package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/find-largest-value-in-each-tree-row/}
 */
public class 在每个树行中找最大值 {

    class Solution {

        public List<Integer> largestValues(TreeNode root) {

            List<Integer> ans = new ArrayList<>();
            if (null == root) {
                return ans;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);


            while (!queue.isEmpty()) {
                int len = queue.size();

                int max = queue.peek().val;
                while (len > 0) {

                    TreeNode poll = queue.poll();
                    max = Math.max(poll.val, max);

                    if (poll.right != null) {
                        queue.offer(poll.right);
                    }

                    if (poll.left != null) {
                        queue.offer(poll.left);
                    }
                    len--;
                }
                ans.add(max);

            }


            return ans;
        }
    }

}
