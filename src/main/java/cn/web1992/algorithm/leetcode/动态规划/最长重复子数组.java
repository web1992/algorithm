package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://programmercarl.com/0718.%E6%9C%80%E9%95%BF%E9%87%8D%E5%A4%8D%E5%AD%90%E6%95%B0%E7%BB%84.html}
 * @link {https://leetcode.cn/problems/maximum-length-of-repeated-subarray/}
 */
public class 最长重复子数组 {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 2, 1};
        int[] num2 = new int[]{3, 2, 1, 4, 7};
        int ans = new Solution().findLength(num1, num2);
        System.out.println("ans=" + ans);
    }

    static class Solution {

        /**
         * 输入：nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
         * 输出：3
         * 解释：长度最长的公共子数组是 [3,2,1]
         */
        public int findLength(int[] nums1, int[] nums2) {

            int len1 = nums1.length;
            int len2 = nums2.length;

            // dp[i][j] 以 i,j 结尾的 最长公共子数组长度是
            int[][] dp = new int[len1 + 1][len2 + 1];

            int max = 0;
            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (nums1[i - 1] == nums2[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }

//            for (int i = 0; i <= len1; i++) {
//                for (int j = 0; j < len2; j++) {
//                    System.out.print(dp[i][j] + ",");
//                }
//                System.out.println();
//            }

            return max;
        }
    }

}
