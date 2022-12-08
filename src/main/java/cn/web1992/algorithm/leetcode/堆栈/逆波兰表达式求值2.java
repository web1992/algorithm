package cn.web1992.algorithm.leetcode.堆栈;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xaqlgj/}
 */
public class 逆波兰表达式求值2 {

    public static void main(String[] args) {
        String[] token = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int ans = new Solution().evalRPN(token);
        System.out.println("ans=" + ans);
    }

    static class Solution {


        Stack<Integer> stack = new Stack<>();

        static Set<String> cal = new HashSet<>();

        static {
            cal.add("+");
            cal.add("-");
            cal.add("*");
            cal.add("/");
        }

        public int evalRPN(String[] tokens) {

            int ans = 0;
            int i = 0;
            int len = tokens.length;

            while (i < len) {
                String str = tokens[i];

                if (!cal.contains(str)) {
                    stack.push(parseNum(str));
                } else {
                    switch (str.charAt(0)) {
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
