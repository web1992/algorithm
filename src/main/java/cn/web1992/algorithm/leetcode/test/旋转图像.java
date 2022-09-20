package cn.web1992.algorithm.leetcode.test;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnhhkv/}
 * @link {https://www.jianshu.com/p/334864f432b0} 数组遍历
 */
public class 旋转图像 {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        printArr(arr);
        new Solution().rotate(arr);
        System.out.println();
        printArr(arr);

    }

    public static void printArr(int[][] arr) {
        for (int[] _arr : arr) {
            System.out.println(Arrays.toString(_arr));
        }
    }


    static class Solution {
        // 上下 + 对角线
        public void rotate(int[][] matrix) {
            int length = matrix.length;
            //先上下交换
            for (int i = 0; i < length / 2; i++) {
                int[] temp = matrix[i];
                matrix[i] = matrix[length - i - 1];
                matrix[length - i - 1] = temp;
            }
            //在按照对角线交换
            for (int i = 0; i < length; ++i) {
                for (int j = i + 1; j < length; ++j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

    }

}
