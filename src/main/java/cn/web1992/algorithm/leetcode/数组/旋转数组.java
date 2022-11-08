package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xm42hs/}
 */
public class 旋转数组 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));

    }

    static class Solution {

        public void rotate(int[] nums, int k) {

            int len = nums.length;
            int n = k % len;
            reverse(nums, 0, len - 1);
            reverse(nums, 0, n - 1);
            reverse(nums, n, len - 1);
        }

        private void reverse(int[] arr, int start, int end) {

            while (start < end) {
                int t = arr[start];
                arr[start] = arr[end];
                arr[end] = t;
                start++;
                end--;
            }
        }
    }

}
