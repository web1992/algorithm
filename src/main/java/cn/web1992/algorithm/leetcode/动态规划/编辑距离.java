package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://leetcode.cn/problems/edit-distance/}
 * @link {https://programmercarl.com/0072.%E7%BC%96%E8%BE%91%E8%B7%9D%E7%A6%BB.html#_72-%E7%BC%96%E8%BE%91%E8%B7%9D%E7%A6%BB}
 */
public class 编辑距离 {

    public static void main(String[] args) {

        String word1 = "horse", word2 = "ros";
        int ans = new Solution().minDistance(word1, word2);
        System.out.println(ans);
    }

    /**
     * 输入：word1 = "horse", word2 = "ros"
     * 输出：3
     * <p>
     * 动态规划
     * </p>
     */
    static class Solution {

        public int minDistance(String word1, String word2) {

            int len1 = word1.length();
            int len2 = word2.length();
            if (len2 == 0 || len1 == 0) {
                return Math.max(len1, len2);
            }
            int[][] dp = new int[len1 + 1][len2 + 1];

            for (int i = 0; i <= len1; i++) {
                dp[i][0] = i;
            }

            for (int j = 0; j <= len2; j++) {
                dp[0][j] = j;
            }

            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {

                    // int left = dp[i - 1][j] + 1;
                    // int down = dp[i][j - 1] + 1;
                    // int left_down = dp[i - 1][j - 1];

                    // 调用 charAt 需要-1 因为i,j从1开始
                    // 不要和dp中的[i][j]搞混了
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {// 如果以，i,j结尾的指向的字符相等，则不需要操作
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        //  Min(插入，删除，替换)
                        int min1 = Math.min(dp[i][j - 1], dp[i - 1][j]);
                        dp[i][j] = Math.min(min1, dp[i - 1][j - 1]) + 1;// dp[i - 1][j - 1] i,j 指向的字符不相等的时候，需要替换字符，因此也需要+1
                    }
                }
            }

            return dp[len1][len2];
        }
    }

}
