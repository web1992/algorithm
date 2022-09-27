package cn.web1992.algorithm.leetcode;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

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

    /**
     * 数组创建 二叉树
     *
     * @param arr
     * @return
     */
    public static TreeNode build(Integer[] arr) {
        if (null == arr) {
            return null;
        }

        return createTree(0, arr);
    }

    public static TreeNode createTree(int index, Integer[] values) {
        if (index >= values.length) {
            return null;
        }

        if (null == values[index]) {
            return null;
        }

        TreeNode rootNode = new TreeNode();
        rootNode.val = values[index];
        rootNode.left = createTree(2 * index + 1, values);
        rootNode.right = createTree(2 * index + 2, values);
        return rootNode;
    }
}