package cn.web1992.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/5/17  11:24
 * @link {https://leetcode.cn/problems/squares-of-a-sorted-array/}
 * @link {https://programmercarl.com/0977.%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9.html#%E5%8F%8C%E6%8C%87%E9%92%88%E6%B3%95}
 */
public class 有序数组的平方 {

    public static void main(String[] args) {

        int[] arr = new int[]{-4, -1, 0, 3, 10};
        int[] rs = new Solution().sortedSquares(arr);

        System.out.println(Arrays.toString(rs));

    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {

            int[] result = new int[nums.length];

            int left = 0;
            int right = nums.length - 1;
            int k = nums.length - 1;

            // -4, -1, 0, 3, 10
            while (left <= right) {
                if (nums[left] * nums[left] > nums[right] * nums[right]) {
                    result[k--] = nums[left] * nums[left];
                    left++;
                } else {
                    result[k--] = nums[right] * nums[right];
                    right--;
                }
            }

            return result;
        }
    }
}
