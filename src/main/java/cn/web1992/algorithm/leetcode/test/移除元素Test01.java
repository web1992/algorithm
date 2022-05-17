package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/5/17  10:58
 * @link {https://leetcode-cn.com/problems/remove-element/}
 */
public class 移除元素Test01 {
    public static void main(String[] args) {

    }

    class Solution {

        public int removeElement(int[] nums, int val) {

            int sIndex = 0;

            // 1,2,3,3,4,5
            // val=2
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[sIndex++] = nums[i];
                }
            }

            return sIndex;
        }

    }
}



