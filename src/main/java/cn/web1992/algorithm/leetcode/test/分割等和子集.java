package cn.web1992.algorithm.leetcode.test;

/**
 * @ink {https://programmercarl.com/0416.%E5%88%86%E5%89%B2%E7%AD%89%E5%92%8C%E5%AD%90%E9%9B%86.html}
 * @ink {https://leetcode.cn/problems/partition-equal-subset-sum/}
 */
public class 分割等和子集 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 11, 5};
        boolean ans = new Solution().canPartition(arr);
        System.out.println("ans=" + ans);
    }

    static class Solution {
        public boolean canPartition(int[] nums) {

            return false;
        }
    }
}
