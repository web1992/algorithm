package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link {https://leetcode.cn/problems/n-ary-tree-level-order-traversal/}
 */
public class N叉树的层序遍历 {


    class Solution {

        public List<List<Integer>> levelOrder(Node root) {

            List<List<Integer>> ans = new ArrayList<>();

            if (null == root) {
                return ans;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {

                int len = queue.size();
                List<Integer> tempList = new ArrayList<>();

                while (len > 0) {
                    Node node = queue.poll();
                    tempList.add(node.val);
                    if (node.children != null) {
                        node.children.forEach(queue::offer);
                    }
                    len--;
                }

                ans.add(tempList);

            }

            return ans;
        }

    }

}
