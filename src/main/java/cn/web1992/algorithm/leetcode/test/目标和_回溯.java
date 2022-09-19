package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/9/11  15:42
 * @link {https://leetcode.cn/problems/target-sum/}
 * @link {https://programmercarl.com/0494.%E7%9B%AE%E6%A0%87%E5%92%8C.html#_494-%E7%9B%AE%E6%A0%87%E5%92%8C}
 */
public class 目标和_回溯 {


    public static void main(String[] args) {

    }

    static class Solution {
        private int count = 0;

        public int findTargetSumWays(int[] nums, int target) {
            back(nums, target, 0, 0);
            return count;
        }

        public void back(int[] nums, int target, int index, int sum) {

            if (index == nums.length) {
                if (target == sum) {
                    count++;
                }
            } else {
                back(nums, target, index + 1, sum - nums[index]);
                back(nums, target, index + 1, sum + nums[index]);
            }
        }
    }

}
