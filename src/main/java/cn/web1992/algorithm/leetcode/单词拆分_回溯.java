package cn.web1992.algorithm.leetcode;

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
public class 单词拆分_回溯 {

    public static void main(String[] args) {

        //  s = "leetcode", wordDict = ["leet", "code"]

        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreak0(s, new HashSet<>(wordDict), 0);

    }

    public static boolean wordBreak0(String s, Set<String> wordDict, int index) {

        if (index >= s.length()) {
            // index>= s.len 说明已经遍历到了字符串的末尾，由于 index-1 已经是true,因此返回true 即可
            return true;
        }

        for (int i = index; i < s.length(); i++) {
            String word = s.substring(index, i + 1);
            System.out.println(word);
            // contains 为true,才会走 wordBreak0
            if (wordDict.contains(word) && wordBreak0(s, wordDict, i + 1)) {
                return true;
            }
        }

        return false;

    }

}
