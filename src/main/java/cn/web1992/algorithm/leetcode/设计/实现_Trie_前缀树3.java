package cn.web1992.algorithm.leetcode.设计;

/**
 * https://leetcode.cn/leetbook/read/top-interview-questions/xaeate/
 *
 * @link {https://leetcode.cn/problems/implement-trie-prefix-tree/solution/trie-tree-de-shi-xian-gua-he-chu-xue-zhe-by-huwt/}
 * @link {https://leetcode.cn/problems/implement-trie-prefix-tree/solutions/717239/shi-xian-trie-qian-zhui-shu-by-leetcode-ti500/}
 */
public class 实现_Trie_前缀树3 {

    public static void main(String[] args) {

    }

    class Trie {

        private boolean isEnd;
        private Trie[] map = new Trie[26];

        public Trie() {

        }

        public void insert(String word) {

            if (null == word) {
                return;
            }

            Trie node = this;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int chi = ch - 'a';
                if (node.map[chi] == null) {
                    node.map[chi] = new Trie();
                }
                node = node.map[chi];
            }
            node.isEnd = true;
        }


        public boolean search(String word) {
            Trie trie = search0(word);
            return null != trie && trie.isEnd;
        }

        public boolean startsWith(String prefix) {
            return null != search0(prefix);
        }

        private Trie search0(String word) {
            if (null == word) {
                return null;
            }
            Trie trie = this;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int chi = ch - 'a';
                if (trie.map[chi] == null) {
                    return null;
                }
                trie = trie.map[chi];
            }
            return trie;
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
