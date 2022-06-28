package cn.web1992.algorithm.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/6/28  09:30
 * @link {https://leetcode.cn/problems/min-cost-climbing-stairs/}
 * @link {https://programmercarl.com/0746.%E4%BD%BF%E7%94%A8%E6%9C%80%E5%B0%8F%E8%8A%B1%E8%B4%B9%E7%88%AC%E6%A5%BC%E6%A2%AF.html}
 */
public class 使用最小花费爬楼梯 {


    public static void main(String[] args) {

        //int[] arr = new int[]{10, 15, 20};
        int[] arr = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int ans = new Solution().minCostClimbingStairs(arr);
        System.out.println("ans=" + ans);
    }

    static class Solution {
        public int minCostClimbingStairs(int[] cost) {

            int len = cost.length;
            int[] dp = new int[len];
            dp[0] = cost[0];
            dp[1] = cost[1];

            for (int i = 2; i < len; i++) {
                dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
            }

            System.out.println(Arrays.toString(dp));
            return Math.min(dp[len - 1], dp[len - 2]);
        }
    }

}
