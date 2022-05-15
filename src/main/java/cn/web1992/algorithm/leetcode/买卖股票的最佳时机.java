package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/3/7  11:05 下午
 * @link {https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/}
 * @implNote 设计一个算法来计算你所能获取的最大利润
 */
public class 买卖股票的最佳时机 {
    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        System.out.println(new 买卖股票的最佳时机().maxProfit(prices));

    }


    // 贪心，用左侧最低点作为买入点，比较右侧-左侧最低点的最大值就是所求最大利润
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);// 最低价格
            int profit = price - minPrice;// 计算利润
            maxProfit = Math.max(profit, maxProfit);// 最大利润
        }

        return maxProfit;
    }
}
