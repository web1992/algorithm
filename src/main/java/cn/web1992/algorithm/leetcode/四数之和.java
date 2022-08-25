package cn.web1992.algorithm.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.cn/problems/4sum/
 */
public class 四数之和 {

    public static void main(String[] args) {
        // 输入：nums = [1,0,-1,0,-2,2], target = 0
        // 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]

        int[] arr = new int[]{1, 0, -1, 0, -2, 2};
        int target = 0;
        for (List<Integer> integers : new Solution().fourSum(arr, target)) {
            System.out.println(integers.toString());
        }

    }

    static class Solution {

        public List<List<Integer>> fourSum(int[] nums, int target) {

            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            int len = nums.length;

            for (int i = 0; i < len; i++) {
                if (nums[i] > 0 && nums[i] > target) {
                    break;
                }
                if (i > 0 && nums[i] == nums[i - 1]) {// i  去重
                    continue;
                }

                for (int j = i + 1; j < len; j++) {

                    int left = j + 1;
                    int right = len - 1;

                    if (j > i + 1 && nums[j] == nums[j - 1]) {// j 去重
                        continue;
                    }

                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];

                        if (sum == target) {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                            while (left < right && nums[left] == nums[left + 1]) {// left 去重
                                left++;
                            }

                            while (left < right && nums[right] == nums[right - 1]) {// right 去重
                                right--;
                            }

                            left++;
                            right--;
                        } else if (sum > target) {
                            right--;
                        } else {// sum <target
                            left++;
                        }

                    }
                }
            }

            return ans;
        }

    }
}
