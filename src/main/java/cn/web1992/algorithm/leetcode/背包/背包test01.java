package cn.web1992.algorithm.leetcode.背包;

public class 背包test01 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bag_size = 4;
        int ans = test_weight_bag_problem(weight, value, bag_size);

        System.out.println("ans=" + ans);
    }

    /**
     * 背包问题测试
     *
     * @param weight   物品的重量
     * @param value    物品的价值
     * @param bag_size 背包的数量
     * @return
     */
    public static int test_weight_bag_problem(int[] weight, int[] value, int bag_size) {

        int ans = 0;
        int itemLen = weight.length;

        // d[i][j] i 表示背包，j 表示容量 [i][j]=第i个背包，容量为j的时候，放的最大价值
        int[][] dp = new int[itemLen + 1][bag_size + 1];
        // 初始化
        for (int i = 0; i < itemLen; i++) {
            dp[i][0] = 0;
        }

        // 先物品  再背包
        for (int i = 1; i <= itemLen; i++) {
            for (int j = 1; j <= bag_size; j++) {
                //System.out.println("i=" + i + " j=" + j);
                if (weight[i - 1] > j) {
                    // 放不下
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 放得下
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }

        // 打印
        for (int i = 0; i < itemLen + 1; i++) {
            for (int j = 0; j < bag_size + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        //        0 0 0 0 0
        //        0 15 15 15 15
        //        0 15 15 20 35
        //        0 15 15 20 35

        ans = dp[itemLen][bag_size];
        return ans;
    }

}
