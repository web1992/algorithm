package cn.web1992.algorithm.leetcode;


import java.util.Arrays;

/**
 * @link {https://leetcode.cn/problems/distinct-subsequences/}
 * @link {https://programmercarl.com/0115.%E4%B8%8D%E5%90%8C%E7%9A%84%E5%AD%90%E5%BA%8F%E5%88%97.html#_115-%E4%B8%8D%E5%90%8C%E7%9A%84%E5%AD%90%E5%BA%8F%E5%88%97}
 */
public class 不同的子序列 {

    public static void main(String[] args) {

        String s = "rabbbit", t = "rabbit";
        int ans = new Solution().numDistinct(s, t);
        System.out.println(ans);
    }

    /**
     * =========================================
     * 输入：s = "rabbbit", t = "rabbit"
     * 输出：3
     * ra b bbit
     * |
     * rab b bit
     * |
     * rabb b it
     * |
     * <p>
     * =========================================
     * <p>
     * 输入：s = "babgbag", t = "bag"
     * 输出：5
     * =========================================
     */
    static class Solution {
        public int numDistinct(String s, String t) {

            int len1 = s.length();
            int len2 = t.length();

            int[][] dp = new int[len1 + 1][len2 + 1];

            for (int i = 0; i <= len1; i++) {
                dp[i][0] = 1;
            }
            // 从 j=1 开始
            for (int j = 1; j <= len2; j++) {
                dp[0][j] = 0;
            }

            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];// s的子串个数 + t的子串个数
                    } else {
                        // i-1 !=j-1时， i-1 表示 => 以i结尾之前个数（s的子串个数）
                        dp[i][j] = dp[i - 1][j];// s的子串个数
                    }
                }
            }
            // dp 数组打印
//            for (int i = 0; i <= len1; i++) {
//                System.out.println(Arrays.toString(dp[i]));
//            }

            return dp[len1][len2];
        }

    }
}
