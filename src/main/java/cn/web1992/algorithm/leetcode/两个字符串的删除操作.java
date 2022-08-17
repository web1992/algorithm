package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/delete-operation-for-two-strings/}
 */
public class 两个字符串的删除操作 {

    public static void main(String[] args) {

        String word1 = "sea", word2 = "eat";

        int ans = new Solution().minDistance(word1, word2);
        System.out.println(ans);

    }

    /**
     * 输入: word1 = "sea", word2 = "eat"
     * 输出: 2
     * 解释: 第一步将 "sea" 变为 "ea" ，第二步将 "eat "变为 "ea"
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/delete-operation-for-two-strings
     */
    static class Solution {

        public int minDistance(String word1, String word2) {

            int len1 = word1.length();
            int len2 = word2.length();
            int[][] dp = new int[len1 + 1][len2 + 1];

            // 初始化
            for (int i = 0; i <= len1; i++) {
                dp[i][0] = i;
            }
            for (int j = 0; j <= len2; j++) {
                dp[0][j] = j;
            }


            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        // i,j  指向的字符相等
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        // i,j  指向的字符 不相等
                        // 删除i：删除j
                        int min1 = Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1);
                        // 删除 i+j
                        dp[i][j] = Math.min(min1, dp[i - 1][j - 1] + 2);
                    }
                }
            }

            return dp[len1][len2];
        }

    }
}
