package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xmf6z5/}
 */
public class 除自身以外数组的乘积 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4};
        int[] ans = new Solution().productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    static class Solution {

        /**
         * 输入: nums = [1,2,3,4]
         * 输出: [24,12,8,6]
         *
         * @param nums
         * @return
         */
        public int[] productExceptSelf(int[] nums) {

            int[] ans = new int[nums.length];
            int[] memLeft = new int[nums.length];
            memLeft[0] = 1;
            for (int i = 1; i < nums.length; i++) {
                memLeft[i] = memLeft[i - 1] * nums[i-1];
            }

            int[] memRight = new int[nums.length];
            memRight[nums.length - 1] = 1;
            for (int i = nums.length - 2; i >= 0; i--) {
                memRight[i] = memRight[i + 1] * nums[i+1];
            }

            for (int i = 0; i < nums.length; i++) {
                ans[i] = memLeft[i] * memRight[i];
            }
            return ans;
        }



    }
}
