package cn.web1992.algorithm.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xaorig/}
 * @link {https://leetcode.cn/problems/word-search-ii/solutions/1000172/dan-ci-sou-suo-ii-by-leetcode-solution-7494/}
 */
public class 单词搜索II {

    public static void main(String[] args) {

        //
        char[][] board = new char[][]{{'a', 'b'}, {'c', 'd'}};
        String[] words = new String[]{"abcb"};

        List<String> ans = new Solution().findWords(board, words);
        System.out.println(ans);
    }

    static class Solution {
        List<String> ans = new ArrayList<>();

        public List<String> findWords(char[][] board, String[] words) {
            do_findWords(board, new HashSet<>(Arrays.asList(words)), 0, 0);
            return ans;
        }

        public void do_findWords(char[][] board, Set<String> set, int i, int j) {


        }
    }
}
