package cn.web1992.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/6/7  16:01
 * @link {https://leetcode.cn/problems/contains-duplicate/}
 */
public class 存在重复元素 {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4};
        boolean b = new Solution().containsDuplicate(arr);
        System.out.println(b);
    }

    static class Solution {

        public boolean containsDuplicate(int[] nums) {
            return Arrays.stream(nums).distinct().count() < nums.length;
        }
    }
}
