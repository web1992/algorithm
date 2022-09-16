package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2y0c2/}
 */
public class 两个数组的交集II {

    public static void main(String[] args) {

        // 输入：nums1 = [1,2,2,1], nums2 = [2,2]
        // 输出：[2,2]
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        int[] ansArr = new Solution().intersect(nums1, nums2);
        System.out.println(Arrays.toString(ansArr));
    }

    static class Solution {

        public int[] intersect(int[] nums1, int[] nums2) {

            Arrays.sort(nums1);
            Arrays.sort(nums2);

            List<Integer> ansList = new ArrayList<>();


            int left1 = 0;
            int left2 = 0;
            while (left1 < nums1.length && left2 < nums2.length) {

                int n1 = nums1[left1];
                int n2 = nums2[left2];

                // 1 2 3
                // 2 3 4
                if (n1 > n2) {
                    left2++;
                } else if (n1 < n2) {
                    left1++;
                } else {
                    ansList.add(n1);
                    left1++;
                    left2++;
                }

            }

            int[] ansArr = new int[ansList.size()];
            for (int i = 0; i < ansList.size(); i++) {
                ansArr[i] = ansList.get(i);
            }

            return ansArr;
        }

    }
}
