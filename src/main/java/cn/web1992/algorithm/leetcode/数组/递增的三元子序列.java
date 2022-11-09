package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xmb141/}
 */
public class 递增的三元子序列 {

    public static void main(String[] args) {

        // 2,1,5,0,4,6
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int[] arr = new int[]{2, 1, 5, 0, 4, 6};
//        int[] arr = new int[]{2,4,-2,-3};
//        int[] arr = new int[]{20, 100, 10, 12, 5, 13};
//        int[] arr = new int[]{6, 7, 1, 2};
        int[] arr = new int[]{1, 5, 0, 4, 1, 3};
        boolean b = new Solution().increasingTriplet(arr);
        System.out.println(b);
    }

    static class Solution {

        //  [1,2,3,4,5]
        //  [1,5,3,6]
        public boolean increasingTriplet(int[] nums) {


            int n = nums[0];
            int m = Integer.MAX_VALUE;

            for (int i = 1; i < nums.length; i++) {

                if (nums[i] <= n) {
                    n = nums[i];
                } else if (nums[i] <= m) {
                    m = nums[i];
                } else {
                    return true;
                }

            }

            return false;
        }
    }
}
