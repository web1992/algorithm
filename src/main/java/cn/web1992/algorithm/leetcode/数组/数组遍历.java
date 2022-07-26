package cn.web1992.algorithm.leetcode.数组;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/7/23  15:32
 */
public class 数组遍历 {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        int[] arr3 = new int[]{7, 8, 9};

        int[][] arr = new int[][]{arr1, arr2, arr3};


        for2(arr);

    }

    private static void for1(int[][] arr) {
        // 正常遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void for2(int[][] arr) {
        int len = arr.length;
        // 倒序遍历
        for (int i = len - 2; i >= 0; i--) {
            System.out.println(Arrays.toString(arr[i]));
            for (int j = i + 1; j < len; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    private static void for3(int[][] arr) {
        // 斜着遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
