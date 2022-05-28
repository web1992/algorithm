package cn.web1992.algorithm.leetcode.test;

import java.sql.Array;
import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/5/3  16:37
 * @link {https://leetcode-cn.com/problems/remove-element/}
 */
public class 移除元素Test02 {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 2, 3};
        int i = removeElement(arr, 3);
        System.out.println(i);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * <pre>
     *     输入：nums = [3,2,2,3], val = 3
     *     输出：2, nums = [2,2]
     * </pre>
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {

        int slowIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[slowIndex++] = nums[i];
            }
        }

        return slowIndex;

    }


}
