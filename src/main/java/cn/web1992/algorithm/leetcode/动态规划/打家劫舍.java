package cn.web1992.algorithm.leetcode.动态规划;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnq4km/}
 */
public class 打家劫舍 {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 9, 3, 1};
        //int[] arr = new int[]{1, 2, 3, 1};
        //int[] arr = new int[]{1, 3, 1, 3, 100};
        int ans = new Solution().rob(arr);
        System.out.println(ans);
    }

    /**
     * 核心思想是，到了第i个房间时，要决定偷还是不偷
     * 偷的话 就是 nums[i] + dp[i-2]
     * 不偷的话就是 dp[i-1]
     * 取两者最大收益即可
     */
    static class Solution {
        // [1,2,3,1]
        public int rob(int[] nums) {

            int len = nums.length;
            if (len == 1) {
                return nums[0];
            }
            int[] dp = new int[len];
            dp[0] = nums[0];
            dp[1] = Math.max(dp[0], nums[1]);

            for (int i = 2; i < len; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }

            //System.out.println(Arrays.toString(dp));
            return dp[len - 1];
        }
    }
}
