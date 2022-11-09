package cn.web1992.algorithm.leetcode.堆栈;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xal9h6/}
 */
public class 数组中的第K个最大元素2 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 6, 4};

        int ans = new Solution().findKthLargest(arr, 2);
        System.out.println(ans);
    }

    static class Solution {

        public int findKthLargest(int[] nums, int k) {
            int p = part(nums, 0, nums.length - 1);
            while (p + 1 != k) {
                if (p + 1 > k) {
                    p = part(nums, 0, p - 1);
                } else {
                    p = part(nums, p + 1, nums.length - 1);
                }

            }
            return nums[p];
        }

        public int part(int[] nums, int left, int right) {
            int val = nums[right];
            int i = left;

            for (int j = i; j < right; j++) {
                if (nums[j] >= val) {
                    swap(nums, i, j);
                    i++;
                }
            }

            swap(nums, i, right);
            return i;
        }

        private void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

}
