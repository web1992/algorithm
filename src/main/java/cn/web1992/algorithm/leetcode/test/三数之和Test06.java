package cn.web1992.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author web1992
 * @date 2022/3/2  10:30 下午
 * @link {https://leetcode-cn.com/problems/3sum/}
 * @link {https://www.bilibili.com/video/BV1JL411c7fU}
 * @link {https://www.bilibili.com/video/BV1rb4y1U7BE}
 * @link {https://www.bilibili.com/video/BV1PL4y177Pg} 三数之和 搞笑版
 */
public class 三数之和Test06 {

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, 4};

        for (List<Integer> sum : threeSum(arr)) {
            System.out.println(sum.toString());
        }
    }

    // 双指针
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        // 排序
        Arrays.sort(nums);

        int len = nums.length;


        for (int i = 0; i < len; i++) {

            if (nums[i] > 0) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    // sum==0
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    right--;
                    left++;
                }
            }

        }


        return list;
    }

}
