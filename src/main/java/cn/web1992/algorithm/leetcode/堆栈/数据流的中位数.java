package cn.web1992.algorithm.leetcode.堆栈;

import java.util.PriorityQueue;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xalff2/}
 */
public class 数据流的中位数 {

    public static void main(String[] args) {

        // PriorityQueue<Integer> minHeap = new PriorityQueue<>(MedianFinder::cmp);
        //
        // minHeap.offer(1);
        // minHeap.offer(9);
        // minHeap.offer(6);
        // while (!minHeap.isEmpty()) {
        // System.out.println(minHeap.poll());
        // }

        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        medianFinder.addNum(-2);
        medianFinder.addNum(-3);
        // medianFinder.addNum(4);
        // medianFinder.addNum(5);
        // medianFinder.addNum(3);
        // medianFinder.addNum(6);
        double median = medianFinder.findMedian();
        System.out.println(median);
    }

    static class MedianFinder {

        // 5-4-3-2-1
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(MedianFinder::cmp);// 放的数据都小于 minHeap 中的数据
        // 50-60-70-80
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        public MedianFinder() {

        }

        public void addNum(int num) {

            // heap 为空的处理
            if (maxHeap.isEmpty() && minHeap.isEmpty()) {
                maxHeap.offer(num);
                return;
            } else if (maxHeap.isEmpty()) {
                minHeap.offer(num);
                maxHeap.offer(minHeap.poll());
                return;
            } else if (minHeap.isEmpty()) {
                maxHeap.offer(num);
                minHeap.offer(maxHeap.poll());
                return;
            }

            // 不为空的处理
            if (num > minHeap.peek()) {
                minHeap.offer(num);
                if (minHeap.size() > maxHeap.size() + 1) {
                    maxHeap.offer(minHeap.poll());
                }
            } else {
                maxHeap.offer(num);
                if (maxHeap.size() > minHeap.size() + 1) {
                    minHeap.offer(maxHeap.poll());
                }
            }

        }

        public double findMedian() {

            if (maxHeap.size() == minHeap.size()) {
                return (minHeap.peek() + maxHeap.peek()) / 2.0;
            } else {
                return minHeap.size() > maxHeap.size() ? minHeap.peek() : maxHeap.peek();
            }

        }

        static private int cmp(int n1, int n2) {
            return n2 - n1;
        }
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
}
