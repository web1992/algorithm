package cn.web1992.algorithm.leetcode.设计;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnkq37/}
 */
public class 最小栈 {

    public static void main(String[] args) {

    }

    static class MinStack {


        private ListNode head;

        public MinStack() {

        }

        public void push(int val) {

            if (null == head) {
                head = new ListNode(val, val, null);
            } else {
                head = new ListNode(val, Math.min(val, head.min), head);
            }
        }

        public void pop() {
            if (empty()) {
                throw new IllegalStateException("为空");
            }
            head = head.next;
        }

        public int top() {
            if (empty()) {
                throw new IllegalStateException("为空");
            }
            return head.val;
        }

        public int getMin() {
            if (empty()) {
                throw new IllegalStateException("为空");
            }
            return head.min;
        }

        public boolean empty() {
            return null == head;
        }
    }

    public static class ListNode {
        public int val;
        public int min;
        public ListNode next;

        ListNode() {
        }

        public ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
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
