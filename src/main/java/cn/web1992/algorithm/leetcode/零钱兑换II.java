package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/coin-change-2/}
 * @link {https://programmercarl.com/0518.%E9%9B%B6%E9%92%B1%E5%85%91%E6%8D%A2II.html}
 */
public class 零钱兑换II {

    public static void main(String[] args) {

        int num = 5;
        int[] arr = new int[]{1, 2, 5};
        int ans = new Solution().change(num, arr);
        System.out.println(ans);
    }


    static class Solution {
        public int change(int amount, int[] coins) {

            int[] dp = new int[amount + 1];
            dp[0] = 1;

            for (int i = 0; i < coins.length; i++) {
                for (int j = coins[i]; j <= amount; j++) {
                    dp[j] += dp[j - coins[i]];
                }
            }

            return dp[amount];
        }
    }

}
