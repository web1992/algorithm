package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xm42hs/}
 */
public class 旋转数组2 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));

    }

    static class Solution {

        public void rotate(int[] nums, int k) {

            int len = nums.length;
            int n = k % len;

        }

        private void swap(int[] arr, int i, int j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

        }

        private void reverse(int[] arr, int start, int end) {

            while (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
    }

}
