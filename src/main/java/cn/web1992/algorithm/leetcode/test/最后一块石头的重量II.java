package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/last-stone-weight-ii/}
 * @link {https://programmercarl.com/1049.%E6%9C%80%E5%90%8E%E4%B8%80%E5%9D%97%E7%9F%B3%E5%A4%B4%E7%9A%84%E9%87%8D%E9%87%8FII.html#_1049-%E6%9C%80%E5%90%8E%E4%B8%80%E5%9D%97%E7%9F%B3%E5%A4%B4%E7%9A%84%E9%87%8D%E9%87%8F-ii}
 */
public class 最后一块石头的重量II {
    public static void main(String[] args) {

        int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int ans = new Solution().lastStoneWeightII(stones);
        System.out.println("ans=" + ans);

    }

    /**
     * 简单来说就是任意选i块石头，使得他们的重量趋近于总重量的一半，因为这样和另一半抵消的差值就是最小的
     */
    static class Solution {

        public int lastStoneWeightII(int[] stones) {

            int sum = 0;
            for (int stone : stones) {
                sum += stone;
            }

            int target = sum / 2;
            int[] dp = new int[target + 1];

            for (int i = 0; i < stones.length; i++) {
                for (int j = target; j >= stones[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
                }
            }

            return sum - dp[target] - dp[target];
        }
    }
}
