package cn.web1992.algorithm.leetcode.动态规划;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class 单词拆分II {

    public static void main(String[] args) {


        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        System.out.println(new Solution().wordBreak(s, wordDict));
    }

    static class Solution {

        List<String> ans = new ArrayList<>();
        LinkedList<String> path = new LinkedList<>();

        public List<String> wordBreak(String s, List<String> wordDict) {
            do_wordBreak(s, new HashSet<>(wordDict), 0);
            return ans;
        }

        public void do_wordBreak(String s, Set<String> wordDict, int start) {

            if (start >= s.length()) {
                ans.add(String.join(" ", path));
                return;
            }

            for (int i = start; i < s.length(); i++) {

                String w = s.substring(start, i + 1);
                if (wordDict.contains(w)) {
                    path.add(w);
                    do_wordBreak(s, wordDict, i + 1);
                    path.removeLast();
                }
            }

        }
    }

}
