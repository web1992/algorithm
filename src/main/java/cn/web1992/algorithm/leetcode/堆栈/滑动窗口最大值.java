package cn.web1992.algorithm.leetcode.堆栈;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xatgye/}
 */
public class 滑动窗口最大值 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = new Solution().maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    static class Solution {

        public int[] maxSlidingWindow(int[] nums, int k) {

            PriorityQueue<Point> queue = new PriorityQueue<>(this::cmp);

            List<Integer> ans = new ArrayList<>();
            int len = nums.length;
            for (int i = 0; i < k; i++) {
                queue.offer(new Point(nums[i], i));
            }

            ans.add(queue.peek().num);

            for (int i = k; i < len; i++) {
                queue.offer(new Point(nums[i], i));
                while (queue.peek().index <= i - k) {// 如果第一个元素（最大的元素）的索引不满足，则 出队
                    queue.poll();
                }
                ans.add(queue.peek().num);
            }

            int[] ansArr = new int[ans.size()];
            for (int i = 0; i < ans.size(); i++) {
                ansArr[i] = ans.get(i);
            }
            return ansArr;
        }


        public int cmp(Point p1, Point p2) {
            return p2.num - p1.num;
        }

        public static class Point {
            int num;
            int index;

            public Point(int num, int index) {
                this.num = num;
                this.index = index;
            }
        }
    }
}
