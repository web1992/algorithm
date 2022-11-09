package cn.web1992.algorithm.leetcode.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 两个数组的交集II {

    public static void main(String[] args) {

    }


    class Solution {

        public int[] intersect(int[] nums1, int[] nums2) {

            int i1 = 0;
            int i2 = 0;
            Arrays.sort(nums1);
            Arrays.sort(nums2);

            List<Integer> list = new ArrayList<>();

            while (i1 < nums1.length && i2 < nums2.length) {

                if (nums1[i1] == nums2[i2]) {
                    list.add(nums1[i1]);
                    i1++;
                    i2++;
                } else if (nums1[i1] > nums2[i2]) {
                    i2++;
                } else {
                    i1++;
                }
            }

            int[] arr = new int[list.size()];
            int i = 0;
            for (Integer n : list) {
                arr[i++] = n;
            }
            return arr;
        }

    }
}
