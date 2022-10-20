package cn.web1992.algorithm.leetcode.数组;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnumcr/}
 */
public class 合并两个有序数组2 {

    public static void main(String[] args) {

    }

    static class Solution {
        // 4,5,5,6
        // 1,2,3,4,5
        // ==========
        // 1,2,3,4,5
        // 4,5,5,6
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int i = m - 1;
            int j = n - 1;
            int end = m + n - 1;

            while (j >= 0) {
                nums1[end--] = (i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--]);
            }

        }
    }
}
