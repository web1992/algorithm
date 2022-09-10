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

    /**
     * 问题抽象：从集合中选取一组数据，去满足某个条件
     */
    static class Solution {
        public boolean canPartition(int[] nums) {

            int sum = 0;
            for (int num : nums) {
                sum += num;
            }

            if (sum % 2 == 1) {
                return false;
            }

            int target = sum / 2;
            int[] dp = new int[10001];

            for (int i = 0; i < nums.length; i++) {
                for (int j = target; j >= nums[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                }
            }

            return dp[target] == target;
        }
    }
}
