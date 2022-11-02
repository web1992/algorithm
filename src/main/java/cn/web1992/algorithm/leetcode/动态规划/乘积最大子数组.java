package cn.web1992.algorithm.leetcode.动态规划;

import java.util.Arrays;

/**
 * https://leetcode.cn/leetbook/read/top-interview-questions/xmk3rv/
 */
public class 乘积最大子数组 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, -5, -2, -4, 3};
//        int[] arr = new int[]{-2, 3, -4};
        int ans = new Solution().maxProduct(arr);
        System.out.println("ans=" + ans);
    }
}


class Solution {
    public int maxProduct(int[] nums) {

        int len = nums.length;
        int[][] dp = new int[len][2];
        dp[0][0] = nums[0];// 最小值
        dp[0][1] = nums[0];// 最大值

        for (int i = 1; i < len; i++) {

            int num = nums[i];
            int n1 = dp[i - 1][0] * num;
            int n2 = dp[i - 1][1] * num;

            // 最小值
            dp[i][0] = Math.min(Math.min(n1, n2), num);
            // 最大值
            dp[i][1] = Math.max(Math.max(n1, n2), num);
        }

        int max = dp[0][1];
        for (int i = 1; i < len; i++) {
            max = Math.max(max, dp[i][1]);
        }
        return max;
    }


}