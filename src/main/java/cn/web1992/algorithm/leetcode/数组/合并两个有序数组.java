package cn.web1992.algorithm.leetcode.数组;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnumcr/}
 */
public class 合并两个有序数组 {

    public static void main(String[] args) {

    }

    static class Solution {
        // 4,5,5,6
        // 1,2,3,4,5
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int index1 = 0;
            int index2 = 0;

            int[] ans = new int[m + n];
            int index = 0;
            while (index1 < m && index2 < n) {
                if (nums1[index1] < nums2[index2]) {
                    ans[index++] = nums1[index1++];
                } else {
                    ans[index++] = nums2[index2++];
                }
            }

            while (index1 < m) {
                ans[index++] = nums1[index1++];
            }

            while (index2 < n) {
                ans[index++] = nums2[index2++];
            }

            // copy
            for (int i = 0; i < ans.length; i++) {
                nums1[i] = ans[i];
            }

        }
    }
}
