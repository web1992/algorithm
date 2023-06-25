package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/edit-distance/}
 */
public class 编辑距离_Test {

    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
        int ans = new Solution().minDistance(word1, word2);
        System.out.println("ans=" + ans);
    }

    static class Solution {

        // 输入：word1 = "horse", word2 = "ros"
        // 你可以对一个单词进行如下三种操作：
        // 插入一个字符
        // 删除一个字符
        // 替换一个字符
        public int minDistance(String word1, String word2) {

            int len1 = word1.length();
            int len2 = word2.length();

            // dp[i][j] 以word1 i 结尾的 到 word2 j 结尾的 最小编辑距离
            // i,j结尾的含义:
            //          需要计算编辑距离，无法避免遍历整字符串
            //          以i,j结尾，也代表了一个遍历的过程，
            //          如果我们，能遍历的计算出，每个i,j结尾的编辑距离最小操作（其实也就是子串）
            //          （是不是？）就能计算出整个字符串的最小编辑距离操作

            // 如果理解了上面的含义，那么此问题，也可以用 操作子串+动态规划 的方式去解决问题。

            int[][] dp = new int[len1 + 1][len2 + 1];

            // 初始化 dp 数组
            for (int i = 0; i <= len1; i++) {
                dp[i][0] = i;
            }

            for (int j = 0; j <= len2; j++) {
                dp[0][j] = j;
            }

            // 遍历
            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        // 结尾相等
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        // 结尾不相等
                        int del_i = dp[i][j - 1]; // 删除 j
                        int del_j = dp[i - 1][j]; // 删除 i
                        int replace_i_j = dp[i - 1][j - 1];// 替换
                        dp[i][j] = 1 + Math.min(Math.min(del_i, del_j), replace_i_j);
                    }
                }
            }

            for (int i = 0; i <= len1; i++) {
                for (int j = 0; j < len2; j++) {
                    System.out.print( dp[i][j] + ",");
                }
                System.out.println();
            }

            // 返回结果
            return dp[len1][len2];
        }

    }
}
