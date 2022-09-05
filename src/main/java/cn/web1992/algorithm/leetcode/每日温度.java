package cn.web1992.algorithm.leetcode;

import java.util.Stack;

/**
 * @link https://leetcode.cn/problems/daily-temperatures/
 */
public class 每日温度 {

    class Solution {

        public int[] dailyTemperatures(int[] temperatures) {

            int[] result = new int[temperatures.length];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < temperatures.length; i++) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    result[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }

            return result;
        }
    }
}
