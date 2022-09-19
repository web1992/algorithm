package cn.web1992.algorithm.leetcode;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2ba4i/}
 */
public class 移动零_2 {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 1, 0, 3, 12};
        new Solution().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Solution {

        // [0,1,0,3,12] -> [1,3,12,0,0]
        public void moveZeroes(int[] nums) {

            int s = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int t = nums[i];
                    nums[i] = nums[s];
                    nums[s] = t;
                    s++;
                }
            }

        }
    }
}
