package cn.web1992.algorithm.leetcode.堆栈;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xau4ci/}
 */
public class 前K个高频元素 {

    public static void main(String[] args) {

        // [1,1,1,2,2,3], k = 2
        int[] arr = new int[]{1, 1, 1, 2, 2, 3};
        int[] ans = new Solution().topKFrequent(arr, 2);
        System.out.println(Arrays.toString(ans));
    }

    static class Solution {

        public int[] topKFrequent(int[] nums, int k) {

            PriorityQueue<Point> queue = new PriorityQueue<>(this::cmp);

            Map<Integer, Point> map = new HashMap<>();
            for (int num : nums) {
                map.merge(num, new Point(num, 1), Point::sum);
            }

            for (Point point : map.values()) {
                queue.offer(point);
            }
            int[] ans = new int[k];

            int i = 0;
            while (i < k) {
                ans[i++] = queue.poll().num;
            }

            return ans;
        }


        private int cmp(Point p1, Point p2) {
            return p2.count - p1.count;
        }

        private static class Point {
            private int num;
            private int count;

            public Point(int num, int count) {
                this.num = num;
                this.count = count;
            }

            public Point sum(Point p) {
                this.count += p.count;
                return this;
            }
        }
    }
}
