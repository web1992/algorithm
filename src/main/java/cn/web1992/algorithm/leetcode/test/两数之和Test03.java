package cn.web1992.algorithm.leetcode.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author web1992
 * @date 2022/5/1  14:07
 * @link {https://leetcode-cn.com/problems/two-sum/}
 */
public class 两数之和Test03 {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[]{map.get(t), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }


}
