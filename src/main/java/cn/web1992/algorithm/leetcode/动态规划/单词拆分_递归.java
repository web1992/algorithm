package cn.web1992.algorithm.leetcode.动态规划;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author web1992
 * @date 2022/4/9  14:52
 * @link {https://www.bilibili.com/video/BV1wi4y1X7C9}
 * @link {https://leetcode-cn.com/problems/word-break/}
 * @link {https://programmercarl.com/0139.%E5%8D%95%E8%AF%8D%E6%8B%86%E5%88%86.html}
 */
public class 单词拆分_递归 {

    public static void main(String[] args) {

        //  s = "leetcode", wordDict = ["leet", "code"]

        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean ans = new Solution().wordBreak(s, wordDict);
        System.out.println(ans);
    }


    static class Solution {

        // 递归
        public boolean wordBreak(String s, List<String> wordDict) {

            return wordBreak(s, new HashSet<>(wordDict), 0);
        }

        public boolean wordBreak(String s, Set<String> wordDict, int startIndex) {
            int len = s.length();
            if (startIndex >= len) {
                return true;
            }
            for (int i = startIndex; i < len; i++) {
                String word = s.substring(startIndex, i + 1);
                //System.out.println(word);
                if (wordDict.contains(word) && wordBreak(s, wordDict, i + 1)) {
                    return true;
                }
            }

            return false;
        }
    }


}
