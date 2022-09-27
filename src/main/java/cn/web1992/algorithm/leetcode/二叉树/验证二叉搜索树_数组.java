package cn.web1992.algorithm.leetcode.二叉树;

import cn.web1992.algorithm.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @link {https://leetcode.cn/problems/validate-binary-search-tree/}
 */
public class 验证二叉搜索树_数组 {

    public static void main(String[] args) {

    }


    class Solution {

        private List<Integer> list = new ArrayList<>();

        public boolean isValidBST(TreeNode root) {

            if (root == null) {
                return true;
            }
            traversal(root);
            for (Integer num : list) {
                System.out.println(num);
            }
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= list.get(i - 1)) {
                    return false;
                }
            }
            return true;
        }

        public void traversal(TreeNode root) {
            if (root == null) {
                return;
            }
            traversal(root.left);
            list.add(root.val);
            traversal(root.right);
        }
    }
}
