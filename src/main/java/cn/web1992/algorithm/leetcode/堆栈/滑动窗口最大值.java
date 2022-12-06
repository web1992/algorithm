package cn.web1992.algorithm.leetcode.堆栈;

import java.util.Arrays;
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

            PriorityQueue<Integer> queue = new PriorityQueue<>((n1, n2) -> n2 - n1);

            int[] ans = new int[nums.length];

            int i = 0;
            for (int num : nums) {
                if (queue.size() < k) {
                    queue.offer(num);
                } else {
                    Integer max = queue.poll();
                    ans[i++] = max;
                    queue.offer(num);
                }
            }

            return ans;
        }
    }
}
