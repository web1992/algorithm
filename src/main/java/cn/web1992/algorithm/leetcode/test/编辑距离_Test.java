package cn.web1992.algorithm.leetcode.test;

/**
 * @link {https://leetcode.cn/problems/edit-distance/}
 */
public class 编辑距离_Test {

    static class Solution {

        // 输入：word1 = "horse", word2 = "ros"
        // 你可以对一个单词进行如下三种操作：
        // 插入一个字符
        // 删除一个字符
        // 替换一个字符
        public int minDistance(String word1, String word2) {

            int len1 = word1.length();
            int len2 = word2.length();

            // dp[i][j] 已word1 i 结尾的 到 word2 j 结尾的 最小编辑距离
            // i,j结尾的含义:
            //          需要计算编辑距离，无法避免遍历整字符串
            //          已i,j结尾，也代表了一个遍历的过程，
            //          如果我们，能遍历的计算出，每个i,j结尾的编辑距离最小操作（其实也就是子串）
            //          就能计算出整个字符串的最小编辑距离操作
            int[][] dp = new int[len1][len2];

            // 初始化 dp 数组

            // 遍历
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    if (word1.charAt(i) == word2.charAt(j)) {

                    } else {

                    }
                }
            }

            // 返回结果
            return -1;
        }

    }
}
