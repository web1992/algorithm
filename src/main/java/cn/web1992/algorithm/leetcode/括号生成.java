package cn.web1992.algorithm.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @link {https://leetcode.cn/problems/generate-parentheses/}
 * @link {https://leetcode.cn/problems/generate-parentheses/solution/ru-men-ji-bie-de-hui-su-fa-xue-hui-tao-lu-miao-don/}
 */
public class 括号生成 {

    // 输入：n = 3
    // 输出：["((()))","(()())","(())()","()(())","()()()"]
    public static void main(String[] args) {

        int input = 3;
        List<String> ans = new Solution().generateParenthesis(input);
        System.out.println(ans.toString());
    }

    static class Solution {

        List<String> ans = null;


        public List<String> generateParenthesis(int n) {

            ans = new ArrayList<>();
            StringBuilder path = new StringBuilder();
            run(path, n, n, n);
            return ans;
        }

        public void run(StringBuilder path, int n, int left, int right) {

            if (2 * n == path.length()) {
                ans.add(path.toString());
                return;
            }

            if (left > 0) {
                run(new StringBuilder(path).append("("), n, left - 1, right);
            }

            if (left < right) {
                run(new StringBuilder(path).append(")"), n, left, right - 1);
            }
        }
    }

}
