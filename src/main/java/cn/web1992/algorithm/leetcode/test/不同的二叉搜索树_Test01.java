package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/unique-binary-search-trees/description/}
 * @link {https://programmercarl.com/0096.%E4%B8%8D%E5%90%8C%E7%9A%84%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91.html#%E6%80%9D%E8%B7%AF}
 */
public class 不同的二叉搜索树_Test01 {

    public static void main(String[] args) {

        int ans = new Solution().numTrees(3);
        System.out.println("ans=" + ans);
    }


    static class Solution {
        public int numTrees(int n) {

            // 1,2,3,4.....i......n
            int[] dp = new int[n];
            dp[0] = 1;
            dp[1] = 1;

            for (int i = 2; i < n; i++) {
                for (int j = 0; j < i - 1; j++) {
                    dp[i] = dp[j] * dp[i - j - 1];
                }
            }

            return dp[n - 1];
        }
    }

}
