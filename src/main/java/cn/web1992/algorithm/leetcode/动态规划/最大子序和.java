package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn3cg3/}
 */
public class 最大子序和 {

    public static void main(String[] args) {

        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = new Solution().maxSubArray(arr);
        System.out.println(ans);
    }

    static class Solution {
        public int maxSubArray(int[] nums) {

            int len = nums.length;
            int[] dp = new int[len];
            dp[0] = nums[0];
            int max = dp[0];

            for (int i = 1; i < len; i++) {
                dp[i] = Math.max(dp[i - 1], 0) + nums[i];
                max = Math.max(max, dp[i]);
            }

            return max;
        }
    }
}
