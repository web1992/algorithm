package cn.web1992.algorithm.leetcode.设计;

import java.util.Random;

public class 打乱数组2 {

    class Solution {

        int[] arr;

        Random R = new Random();

        public Solution(int[] nums) {
            this.arr = nums;
        }

        public int[] reset() {
            return arr;
        }

        public int[] shuffle() {
            int[] _arr = arr.clone();

            for (int i = _arr.length - 1; i >= 0; i--) {
                int k = R.nextInt(i + 1);
                swap(_arr, i, k);
            }

            return _arr;
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
