package cn.web1992.algorithm.leetcode.堆栈;

import java.util.PriorityQueue;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xalff2/}
 */
public class 数据流的中位数 {

    class MedianFinder {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        public MedianFinder() {

        }

        public void addNum(int num) {
            queue.add(num);
        }

        public double findMedian() {

            // 1-2-3-4
            // 1-2-3-4-5
            int len = queue.size();
            Integer[] arr = queue.toArray(new Integer[queue.size()]);
            if (len % 2 == 0) {
                int i = (len / 2);
                return (arr[i] + arr[i + 1]) / 2;
            } else {
                int i = (len / 2);
                return arr[i + 1];
            }

        }
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
}
