package cn.web1992.algorithm.leetcode.test;

import java.util.Arrays;

public class 数组中的第K个最大元素Test01 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        Solution ins = new Solution();

        ins.buildHeap(nums, nums.length);
        System.out.println(Arrays.toString(nums));

        System.out.println(new Solution().findKthLargest(nums, 4));
    }

    static class Solution {

        public int findKthLargest(int[] nums, int k) {

            int len = nums.length;
            buildHeap(nums, len);

            // [6, 5, 4, 3, 2, 1]
            // 6-2+1=5，// i=6-1=5
            int index = 0;
            for (int i = len - 1; i >= nums.length - k + 1; i--) {
                swap(nums, i, index);
                heapfiy(nums, --len, index);
            }
            return nums[0];

        }

        private void buildHeap(int[] nums, int len) {

            int lastNode = nums.length - 1;
            int index = (lastNode - 1) / 2;

            for (int i = index; i >= 0; i--) {
                heapfiy(nums, len, i);
            }

        }

        private void heapfiy(int[] nums, int len, int parentIndex) {

            int max = parentIndex;
            int c1 = parentIndex * 2 + 1;
            int c2 = parentIndex * 2 + 2;

            if (c1 < len && nums[c1] > nums[max]) {
                max = c1;
            }

            if (c2 < len && nums[c2] > nums[max]) {
                max = c2;
            }

            if (max != parentIndex) {
                swap(nums, parentIndex, max);
                heapfiy(nums, len, max);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int n = nums[i];
            nums[i] = nums[j];
            nums[j] = n;
        }

    }


}
