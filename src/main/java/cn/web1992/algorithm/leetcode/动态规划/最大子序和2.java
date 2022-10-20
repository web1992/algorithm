package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn3cg3/}
 */
public class 最大子序和2 {

    public static void main(String[] args) {

        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = new Solution().maxSubArray(arr);
        System.out.println(ans);
    }

    static class Solution {
        public int maxSubArray(int[] nums) {

            int len = nums.length;

            int pre = nums[0];
            int max = pre;

            for (int i = 1; i < len; i++) {
                int n = Math.max(pre, 0) + nums[i];
                max = Math.max(max, n);
                pre = n;
            }

            return max;
        }
    }
}
