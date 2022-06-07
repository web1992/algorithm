package cn.web1992.algorithm.leetcode.背包;

/**
 * @author web1992
 * @date 2022/4/27  23:21
 * @link {https://programmercarl.com/%E8%83%8C%E5%8C%85%E7%90%86%E8%AE%BA%E5%9F%BA%E7%A1%8001%E8%83%8C%E5%8C%85-1.html}
 * @link {https://www.bilibili.com/video/BV1cg411g7Y6} 背包问题
 */
public class 背包 {

    public static void main(String[] args) {
        int[] weight = {1, 3, 4};// 物品的重量
        int[] value = {15, 20, 30};// 物品的价值
        int bagsize = 4;
        testweightbagproblem(weight, value, bagsize);
    }

    public static void testweightbagproblem(int[] weight, int[] value, int bagsize) {
        int wlen = weight.length, value0 = 0;
        //定义dp数组：dp[i][j]表示背包容量为j时，前i个物品能获得的最大价值
        int[][] dp = new int[wlen + 1][bagsize + 1];
        //初始化：背包容量为0时，能获得的价值都为0
        for (int i = 0; i <= wlen; i++) {
            dp[i][0] = value0;
        }
        //遍历顺序：先遍历物品，再遍历背包容量
        for (int i = 1; i <= wlen; i++) {
            for (int j = 1; j <= bagsize; j++) {
                if (j < weight[i - 1]) {// i 从1开始，因此需要-1
                    // 重量放不下，使用上一个物品的价值
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 上一个物品的价值 与上一个物品的背包容量为 j - weight[i - 1] 的价值 + 此新价值（value[i - 1]）
                    // value，weight 中的i-1 是因为索引从1开始
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }
        //打印dp数组
        for (int i = 0; i <= wlen; i++) {
            for (int j = 0; j <= bagsize; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
