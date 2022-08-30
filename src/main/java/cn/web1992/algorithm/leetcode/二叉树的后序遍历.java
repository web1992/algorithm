package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link {https://leetcode.cn/problems/binary-tree-postorder-traversal/}
 */
public class 二叉树的后序遍历 {

    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {


            List<Integer> ans = new ArrayList<>();
            iterator(root, ans);
            return ans;
        }

        private void iterator(TreeNode root, List<Integer> ans) {
            if (root == null) {
                return;
            }

            iterator(root.left, ans);
            iterator(root.right, ans);
            ans.add(root.val);
        }
    }


}
