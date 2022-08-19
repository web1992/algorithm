package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/integer-break/}
 * @link {https://programmercarl.com/0343.%E6%95%B4%E6%95%B0%E6%8B%86%E5%88%86.html#}
 */
public class 整数拆分Test01 {

    public static void main(String[] args) {
        int input = 10;
        int ans = new Solution().integerBreak(input);
        System.out.println(ans);
    }

    static class Solution {

        /**
         * 输入: n = 2
         * 输出: 1
         * 解释: 2 = 1 + 1, 1 × 1 = 1。
         *
         * @param n
         * @return
         */
        public int integerBreak(int n) {
            int[] dp = new int[n + 1];

            // 0,1  拆分无意义
            // 2    可拆分成 1+1，所以i从3开始
            for (int i = 3; i <= n; i++) {
                for (int j = 1; j < i - 1; j++) {
                    // i 拆分成a=i,b=i-j        =>  (i - j) * j    // 二个数
                    // i 拆分成a,b,c ... 等多个数 =>  dp[i - j] * j // 多个数
                    dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, (i - j) * j));
                }
            }

            return dp[n];
        }
    }
}
