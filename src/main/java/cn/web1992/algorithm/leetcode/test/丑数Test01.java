package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/6/8  22:54
 */
public class 丑数Test01 {
    /**
     * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
     *
     * @param args
     */
    public static void main(String[] args) {

        int ans = new Solution().nthUglyNumber(10);
        System.out.println(ans);
    }

    static class Solution {
        public int nthUglyNumber(int n) {

            int[] dp = new int[n];
            dp[0] = 1;
            int p2 = 0, p3 = 0, p5 = 0;

            for (int i = 1; i < n; i++) {

                int min = Math.min(dp[p2] * 2, dp[p3] * 3);
                min = Math.min(dp[p5] * 5, min);

                if (min == dp[p2] * 2) {
                    p2++;
                }
                if (min == dp[p3] * 3) {
                    p3++;
                }
                if (min == dp[p5] * 5) {
                    p5++;
                }
                dp[i] = min;

            }

            return dp[n - 1];
        }
    }
}
