package cn.web1992.algorithm.leetcode.堆栈;

import java.util.Stack;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xa8q4g/}
 */
public class 基本计算器II {

    public static void main(String[] args) {

        String str = "0";
        int ans = new Solution().calculate(str);
        System.out.println("ans=" + ans);
    }

    static class Solution {

        public int calculate(String s) {

            if (s.length() == 1) {
                return s.charAt(0) - '0';
            }
            s = s.trim();
            //  "3+2*2+1"
            // +,-,*,/
            Stack<Integer> stack = new Stack<>();

            int ans = 0;
            char pre_sign = '+';
            char[] chars = s.toCharArray();

            int num = 0;
            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];
                if (Character.isDigit(ch)) {
                    num = num * 10 + ch - '0';
                }
                if (ch == ' ') {
                    continue;
                }
                if (!Character.isDigit(ch) || i == s.length() - 1) {
                    switch (pre_sign) {
                        case '+':
                            stack.push(num);
                            break;
                        case '-':
                            stack.push(-num);
                            break;
                        case '*':
                            stack.push(stack.pop() * num);
                            break;
                        case '/':
                            stack.push(stack.pop() / num);
                            break;
                    }
                    num = 0;
                    pre_sign = ch;

                }

            }
            while (!stack.isEmpty()) {
                ans += stack.pop();
            }
            return ans;

        }


        private static int parseNum(String ch) {
            return Integer.parseInt(ch);
        }

    }
}
