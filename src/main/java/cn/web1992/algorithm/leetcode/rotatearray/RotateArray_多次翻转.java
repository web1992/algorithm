package cn.web1992.algorithm.leetcode.rotatearray;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2020/2/27  22:51
 * @link {https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/}
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2skh7/}
 */
public class RotateArray_多次翻转 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 2, 3, 4, 5, 0, 0, 0};
        new Solution().rotate(arr, 5);
        // [4, 5, 0, 0, 0, 1, 5, 2, 3]
        System.out.println(Arrays.toString(arr));
    }

    static class Solution {
        public void rotate(int[] nums, int k) {

            // k 可能大于 nums.length，因此需要 % 操作
            k %= nums.length;

            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);

        }

        public void reverse(int[] arr, int start, int end) {

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
