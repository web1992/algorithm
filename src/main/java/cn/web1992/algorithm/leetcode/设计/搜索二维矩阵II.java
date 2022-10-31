package cn.web1992.algorithm.leetcode.设计;

import cn.web1992.algorithm.leetcode.加一;

/**
 * @Link {https://leetcode.cn/leetbook/read/top-interview-questions/xmlwi1/}
 */
public class 搜索二维矩阵II {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        boolean ans = new Solution().searchMatrix(arr, 4);
        System.out.println(ans);
    }

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {


            int len = matrix.length;
            int col = 0;
            int row = len - 1;

            while (row >= 0 && col < matrix[0].length) {
                int n = matrix[row][col];
                if (n > target) {
                    row--;
                } else if (n < target) {
                    col++;
                } else {
                    return true;
                }
            }

            return false;
        }


    }
}
