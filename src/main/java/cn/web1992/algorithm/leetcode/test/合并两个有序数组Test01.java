package cn.web1992.algorithm.leetcode.test;

public class 合并两个有序数组Test01 {


    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int index1 = m - 1, index2 = n - 1;
            int curIndex = nums1.length - 1;

            // arr1=1,2,3 arr2=4,5,6
            // arr1=4,5,6 arr2=1,2,3
            while (index1 >= 0 && index2 >= 0) {

                int n1 = nums1[index1];
                int n2 = nums2[index2];

                if (n1 > n2) {
                    nums1[curIndex--] = n1;
                    index1--;
                } else {
                    nums1[curIndex--] = n2;
                    index2--;
                }
            }

            while (index1 >= 0) {
                nums1[curIndex--] = nums1[index1--];
            }
            while (index2 >= 0) {
                nums1[curIndex--] = nums2[index2--];
            }
        }
    }


}
