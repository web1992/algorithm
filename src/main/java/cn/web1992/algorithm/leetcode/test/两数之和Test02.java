package cn.web1992.algorithm.leetcode.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author web1992
 * @date 2022/5/3  19:13
 * @link {https://leetcode-cn.com/problems/two-sum/}
 */
public class 两数之和Test02 {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        if (nums.length < 2) {
            return new int[]{};
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            } else {
                map.put(nums[i], i);
            }

        }

        return new int[]{};
    }
}
