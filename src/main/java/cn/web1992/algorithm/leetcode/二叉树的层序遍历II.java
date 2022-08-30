package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/}
 * @link {https://programmercarl.com/0102.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86.html#_107-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E6%AC%A1%E9%81%8D%E5%8E%86-ii}
 */
public class 二叉树的层序遍历II {

    class Solution {


        public List<List<Integer>> levelOrderBottom(TreeNode root) {

            List<List<Integer>> ans = new ArrayList<>();

            if (null == root) {
                return ans;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {

                int len = queue.size();
                List<Integer> tempList = new ArrayList<>();

                while (len > 0) {

                    TreeNode node = queue.poll();
                    tempList.add(node.val);

                    if (node.left != null) {
                        queue.offer(node.left);
                    }

                    if (node.right != null) {
                        queue.offer(node.right);
                    }

                    len--;

                }

                ans.add(tempList);
            }

            List<List<Integer>> tempAns = new ArrayList<>();
            for (int i = ans.size() - 1; i >= 0; i--) {
                tempAns.add(ans.get(i));
            }
            return tempAns;
        }


    }


}
