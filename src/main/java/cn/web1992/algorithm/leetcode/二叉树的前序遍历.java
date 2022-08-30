package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link {https://leetcode.cn/problems/binary-tree-preorder-traversal/}
 */
public class 二叉树的前序遍历 {

    class Solution {


        public List<Integer> preorderTraversal(TreeNode root) {

            List<Integer> ans = new ArrayList<>();
            iterator(root, ans);
            return ans;
        }


        public void iterator(TreeNode root, List<Integer> list) {

            if (null == root) {
                return;
            }
            list.add(root.val);
            iterator(root.left, list);
            iterator(root.right, list);
        }
    }

}
