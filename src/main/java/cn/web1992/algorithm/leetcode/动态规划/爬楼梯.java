package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn854d/}
 */
public class 爬楼梯 {

    public static void main(String[] args) {

    }

    static class Solution {

        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}
