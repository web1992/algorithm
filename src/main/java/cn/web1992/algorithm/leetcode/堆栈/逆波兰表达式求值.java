package cn.web1992.algorithm.leetcode.堆栈;

import java.util.Stack;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xaqlgj/}
 */
public class 逆波兰表达式求值 {

    public static void main(String[] args) {
        String[] token = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int ans = new Solution().evalRPN(token);
        System.out.println("ans=" + ans);
    }

    static class Solution {


        Stack<Integer> stack = new Stack<>();

        public int evalRPN(String[] tokens) {

            int ans = 0;
            int i = 0;
            int len = tokens.length;

            while (i < len) {
                String str = tokens[i];

                char ch = str.charAt(0);
                if (str.length() > 1) {
                    stack.push(parseNum(str));
                } else if (Character.isDigit(ch)) {
                    stack.push(ch - '0');
                } else {
                    switch (ch) {
                        case '+':
                            stack.push(stack.pop() + stack.pop());
                            break;
                        case '-':
                            int a1 = stack.pop();
                            int b1 = stack.pop();
                            stack.push(b1 - a1);
                            break;
                        case '*':
                            stack.push(stack.pop() * stack.pop());
                            break;
                        case '/':
                            int a = stack.pop();
                            System.out.println("a=" + a);
                            int b = stack.pop();
                            stack.push(b / a);
                            break;
                    }
                }

                i++;
            }

            ans = stack.pop();
            return ans;
        }

        private static int parseNum(String ch) {
            return Integer.parseInt(ch);
        }
    }
}
