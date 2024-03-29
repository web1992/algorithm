package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/9/11  15:42
 * @link {https://leetcode.cn/problems/target-sum/}
 * @link {https://programmercarl.com/0494.%E7%9B%AE%E6%A0%87%E5%92%8C.html#_494-%E7%9B%AE%E6%A0%87%E5%92%8C}
 */
public class 目标和 {


    public static void main(String[] args) {

    }

    static class Solution {

        int count = 0;

        public int findTargetSumWays(int[] nums, int target) {
            doSum(nums, target, 0, 0);
            return count;
        }

        private void doSum(int[] nums, int target, int sum, int start) {
            if (start >= nums.length) {
                if (sum == target) {
                    count++;
                }
                return;
            }

            doSum(nums, target, sum - nums[start], start + 1);
            doSum(nums, target, sum + nums[start], start + 1);

        }
    }

}
