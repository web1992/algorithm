package cn.web1992.algorithm.leetcode.堆栈;

import java.util.Random;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xal9h6/}
 * @link {https://leetcode.cn/problems/kth-largest-element-in-an-array/solutions/307351/shu-zu-zhong-de-di-kge-zui-da-yuan-su-by-leetcode-/} 题解
 */
public class 数组中的第K个最大元素 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 6, 4};

        int ans = new Solution().findKthLargest(arr, 2);
        System.out.println(ans);
    }

    static class Solution {
        Random random = new Random();

        public int findKthLargest(int[] nums, int k) {

            return quickSelect(nums, 0, nums.length - 1, nums.length - k);
        }

        public int quickSelect(int[] nums, int left, int right, int index) {

            int p = randomPartition(nums, left, right);
            if (p == index) {
                return nums[p];
            }

            return p > index ? quickSelect(nums, 0, p - 1, index) : quickSelect(nums, p + 1, right, index);
        }

        public int randomPartition(int[] a, int l, int r) {
            int i = random.nextInt(r - l + 1) + l;
            swap(a, i, r);
            return part(a, l, r);
        }

        public int part(int[] nums, int left, int right) {
            int val = nums[right];
            int i = left;

            for (int j = i; j < right; j++) {
                if (nums[j] <= val) {
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
