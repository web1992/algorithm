package cn.web1992.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author web1992
 * @date 2022/4/9  14:52
 * @link {https://www.bilibili.com/video/BV1wi4y1X7C9}
 * @link {https://leetcode-cn.com/problems/word-break/}
 * @link {https://programmercarl.com/0139.%E5%8D%95%E8%AF%8D%E6%8B%86%E5%88%86.html}
 */
public class 单词拆分 {

    public static void main(String[] args) {

        //  s = "leetcode", wordDict = ["leet", "code"]

        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        System.out.println(wordBreak(s, wordDict));
    }

    // 动态规划 -> 使用解决背包问题的思路取解决
    public static boolean wordBreak(String s, List<String> wordDict) {

        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;

        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[len];

    }

}
