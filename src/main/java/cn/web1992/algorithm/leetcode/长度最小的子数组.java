package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/5/17  20:51
 * @link {https://leetcode.cn/problems/minimum-size-subarray-sum/}
 * @link {https://programmercarl.com/0209.%E9%95%BF%E5%BA%A6%E6%9C%80%E5%B0%8F%E7%9A%84%E5%AD%90%E6%95%B0%E7%BB%84.html#%E6%BB%91%E5%8A%A8%E7%AA%97%E5%8F%A3}
 */
public class 长度最小的子数组 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 1, 2, 4, 3};
        int ans = new Solution().minSubArrayLen(7, arr);

        System.out.println("ans=" + ans);
    }

    static class Solution {

        public int minSubArrayLen(int target, int[] nums) {

            int minLen = Integer.MAX_VALUE;
            int sum = 0;
            int i = 0;

            for (int j = 0; j < nums.length; j++) {

                sum += nums[j];
                while (sum >= target) {
                    minLen = Math.min(minLen, j - i + 1);
                    sum -= nums[i++];
                }
            }

            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }
    }

}
