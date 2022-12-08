package cn.web1992.algorithm.leetcode.堆栈;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xa7r55/}
 */
public class 最小栈 {


    static class MinStack {


        Stack<Integer> stack = new Stack<>();
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        public MinStack() {

        }

        public void push(int val) {
            stack.push(val);
            minQueue.offer(val);
        }

        public void pop() {
            Integer pop = stack.pop();
            minQueue.remove(pop);
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minQueue.peek();
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
