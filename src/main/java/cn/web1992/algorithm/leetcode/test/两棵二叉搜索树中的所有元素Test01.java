package cn.web1992.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author web1992
 * @date 2022/5/1  13:26
 * @link {https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/}
 */
public class 两棵二叉搜索树中的所有元素Test01 {
    public static void main(String[] args) {

    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        getList(list1, root1);
        getList(list2, root2);


        int index1 = 0;
        int index2 = 0;
        while (true) {

            if (index1 >= list1.size() || index2 >= list2.size()) {
                break;
            }

            int e1 = list1.get(index1);
            int e2 = list2.get(index2);

            if (e1 > e2) {
                ans.add(e2);
                index2++;
            } else {
                ans.add(e1);
                index1++;
            }

        }

        while (index1 < list1.size()) {
            ans.add(list1.get(index1++));
        }
        while (index2 < list2.size()) {
            ans.add(list2.get(index2++));
        }

        return ans;
    }

    /**
     * 从小到大
     *
     * @param list
     * @param root
     */
    private static void getList(List<Integer> list, TreeNode root) {

        TreeNode p = root;
        if (p == null) {
            return;
        }

        getList(list, p.left);
        list.add(p.val);
        getList(list, p.right);

    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
