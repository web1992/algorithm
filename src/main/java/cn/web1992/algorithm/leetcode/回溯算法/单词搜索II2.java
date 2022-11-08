package cn.web1992.algorithm.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xaorig/}
 * @link {https://leetcode.cn/problems/word-search-ii/solutions/1000172/dan-ci-sou-suo-ii-by-leetcode-solution-7494/}
 */
public class 单词搜索II2 {

    public static void main(String[] args) {
        char[][] board = new char[][]{{'a', 'b'}, {'c', 'd'}};
        String[] words = new String[]{"ab"};

        List<String> ans = new Solution().findWords(board, words);
        System.out.println(ans);
    }

    static class Solution {
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        public List<String> findWords(char[][] board, String[] words) {
            Trie trie = new Trie();
            for (String word : words) {
                trie.insert(word);
            }
            System.out.println(trie);
            Set<String> ans = new HashSet<>();
            for (int i = 0; i < board.length; ++i) {
                for (int j = 0; j < board[0].length; ++j) {
                    dfs(board, trie, i, j, ans);
                }
            }

            return new ArrayList<>(ans);
        }

        public void dfs(char[][] board, Trie now, int i1, int j1, Set<String> ans) {
            if (!now.children.containsKey(board[i1][j1])) {
                return;
            }
            char ch = board[i1][j1];
            now = now.children.get(ch);
            if (!"".equals(now.word)) {
                ans.add(now.word);
            }

            board[i1][j1] = '#';

            for (int[] dir : dirs) {
                int i2 = i1 + dir[0], j2 = j1 + dir[1];
                if (i2 >= 0 && i2 < board.length && j2 >= 0 && j2 < board[0].length) {
                    dfs(board, now, i2, j2, ans);
                }
            }
            board[i1][j1] = ch;
        }
    }

    static class Trie {

        String word = "";
        Map<Character, Trie> children;
        boolean isWord;

        public Trie() {
            this.word = "";
            this.children = new HashMap<Character, Trie>();
        }

        public void insert(String word) {
            Trie cur = this;
            for (int i = 0; i < word.length(); ++i) {
                char c = word.charAt(i);
                if (!cur.children.containsKey(c)) {
                    cur.children.put(c, new Trie());
                }
                cur = cur.children.get(c);
            }
            cur.word = word;

        }

        @Override
        public String toString() {
            return this.children.toString();
        }
    }

}
