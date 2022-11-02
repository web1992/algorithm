package cn.web1992.algorithm.leetcode.设计;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.cn/leetbook/read/top-interview-questions/xaeate/
 */
public class 实现_Trie_前缀树 {

    public static void main(String[] args) {

    }

    class Trie {

        Map<String, String> map = new HashMap<>();

        Set<String> set = new HashSet<>();

        public Trie() {

        }

        public void insert(String word) {
            if (null == word) {
                return;
            }
            set.add(word);

            for (int i = 0; i < word.length(); i++) {
                addPrefix(word, i + 1);
            }

        }

        public void addPrefix(String word, int end) {
            map.put(word.substring(0, end), word);
        }

        public boolean search(String word) {

            if (set.contains(word)) {
                return true;
            }
            return false;
        }

        public boolean startsWith(String prefix) {

            if (map.containsKey(prefix)) {
                return true;
            }

            return false;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
