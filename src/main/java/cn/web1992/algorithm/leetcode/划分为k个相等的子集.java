package cn.web1992.algorithm.leetcode;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/problems/partition-to-k-equal-sum-subsets/}
 */
public class 划分为k个相等的子集 {

    /**
     * 输入： nums = [4, 3, 2, 3, 5, 2, 1], k = 4
     * 输出： True
     * 说明： 有可能将其分成 4 个子集（5），（1,4），（2,3），（2,3）等于总和。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/partition-to-k-equal-sum-subsets
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {


         System.out.println(5>>2);
         System.out.println(6>>2);
         System.out.println(10>>2);
        int[] nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        new Solution().canPartitionKSubsets(nums, k);


    }

    static class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int all = Arrays.stream(nums).sum();
            if (all % k != 0) {
                return false;
            }
            int per = all / k;
            Arrays.sort(nums);
            int n = nums.length;
            if (nums[n - 1] > per) {
                return false;
            }
            boolean[] dp = new boolean[1 << n];
            int[] curSum = new int[1 << n];
            dp[0] = true;
            for (int i = 0; i < 1 << n; i++) {
                if (!dp[i]) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    if (curSum[i] + nums[j] > per) {
                        break;
                    }
                    if (((i >> j) & 1) == 0) {

//                        System.out.println("i=" + Integer.toBinaryString(i) + ",j=" + Integer.toBinaryString(j));
                        int next = i | (1 << j);
                        if (!dp[next]) {
                            curSum[next] = (curSum[i] + nums[j]) % per;
                            dp[next] = true;
                        }
                    }
                }
            }
            return dp[(1 << n) - 1];
        }
    }

}
