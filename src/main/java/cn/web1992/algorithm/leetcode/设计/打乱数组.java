package cn.web1992.algorithm.leetcode.设计;

import cn.web1992.algorithm.leetcode.ListNode;

import java.util.Random;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn6gq1/}
 */
public class 打乱数组 {

    public static void main(String[] args) {

    }

    class Solution {


        private int[] v;

        public Solution(int[] nums) {
            this.v = nums;
        }

        public int[] reset() {

            return v;
        }

        public int[] shuffle() {
            int[] arr = v.clone();

            for (int i = v.length - 1; i >= 0; i--) {
                int j = new Random().nextInt(i + 1);
                swap(arr, j, i);
            }
            return arr;
        }

        private void swap(int[] arr, int i, int j) {
            int n = arr[i];
            arr[i] = arr[j];
            arr[j] = n;
        }
    }


    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(nums);
     * int[] param_1 = obj.reset();
     * int[] param_2 = obj.shuffle();
     */
}
