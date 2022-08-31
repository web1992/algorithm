package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @implNote 二叉树
 * @implNote 回溯算法
 * @link {https://leetcode.cn/problems/binary-tree-paths/}
 * @link {https://programmercarl.com/0257.%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%89%80%E6%9C%89%E8%B7%AF%E5%BE%84.html#%E8%BF%AD%E4%BB%A3%E6%B3%95}
 */
public class 二叉树的所有路径 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, null, 5};
        TreeNode root = TreeNode.build(arr);
        List<String> stringList = new Solution().binaryTreePaths(root);
        for (String s : stringList) {
            System.out.println(s);
        }
    }

    static class Solution {

        List<String> ans = new ArrayList<>();

        public List<String> binaryTreePaths(TreeNode root) {
            List<Integer> path = new ArrayList<>();
            doBinaryTreePaths(root, path);
            return ans;
        }

        public void doBinaryTreePaths(TreeNode root, List<Integer> path) {

            path.add(root.val);

            if (root.left == null && root.right == null) {
                ans.add(path.stream().map(String::valueOf).collect(Collectors.joining("->")));
                return;
            }

            if (root.left != null) {
                doBinaryTreePaths(root.left, path);
                path.remove(path.size() - 1);
            }
            if (root.right != null) {
                doBinaryTreePaths(root.right, path);
                path.remove(path.size() - 1);
            }
        }

    }
}
