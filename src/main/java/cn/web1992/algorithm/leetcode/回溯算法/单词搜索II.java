package cn.web1992.algorithm.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

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

        // 上，下，左，右 四个方向
        int[][] dirs = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        public List<String> findWords(char[][] board, String[] words) {
            Trie trie = new Trie();
            for (String word : words) {
                trie.insert(word);
            }

            Set<String> ans = new HashSet<>();

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    do_findWords(board, ans, trie, i, j);
                }
            }

            return new ArrayList<>(ans);
        }

        public void do_findWords(char[][] board, Set<String> set, Trie root, int i, int j) {
            char ch = board[i][j];

            if (!root.map.containsKey(ch)) {
                return;
            }

            if (root.isWord()) {
                set.add(root.word);
            }

            // 设置已经处理过的标记
            board[i][j] = 'x';

            for (int[] dir : dirs) {
                int ii = i + dir[0], jj = j + dir[1];
                if (ii >= 0 && ii < board.length && jj >= 0 && j < board[ii].length) {
                    do_findWords(board, set, root, i, j);
                }
            }

            // 还原
            board[i][j] = ch;
        }
    }

    static class Trie {

        String word;
        Map<Character, Trie> map = new HashMap<>();

        public void insert(String word) {

            Trie node = this;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!node.map.containsKey(ch)) {
                    node.map.put(ch, new Trie());
                }
                node = node.map.get(ch);
            }
            node.word = word;

        }

        public boolean isWord() {
            return null != word;
        }
    }
}
