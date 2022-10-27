package cn.web1992.algorithm.leetcode.设计;

import java.util.Stack;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnbcaj/}
 */
public class 有效的括号 {

    public static void main(String[] args) {

        String str = "()[]{}";
        boolean ans = new Solution().isValid(str);
        System.out.println(ans);
    }

    static class Solution {
        public boolean isValid(String s) {

            if (s.length() == 1) {
                return false;
            }

            Stack<Character> stack = new Stack<>();

            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {

                char ch = chars[i];

                if ('(' == ch) {
                    stack.push(ch);

                } else if ('[' == ch) {
                    stack.push(ch);

                } else if ('{' == ch) {
                    stack.push(ch);

                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (ch == ')') {
                        Character pop = stack.pop();
                        if (!pop.equals('(')) {
                            return false;
                        }
                    } else if (ch == ']') {
                        Character pop = stack.pop();
                        if (!pop.equals('[')) {
                            return false;
                        }
                    } else if (ch == '}') {
                        Character pop = stack.pop();
                        if (!pop.equals('{')) {
                            return false;
                        }
                    }

                }

            }

            return stack.isEmpty();
        }


    }

}
