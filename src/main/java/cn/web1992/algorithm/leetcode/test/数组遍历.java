package cn.web1992.algorithm.leetcode.test;

import java.util.Arrays;

/**
 * @link {https://www.jianshu.com/p/334864f432b0}
 */
public class 数组遍历 {


    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArr(arr);
        printArr3(arr);
    }

    /**
     * <pre>
     *     1 2 3
     *     4 5 6
     *     7 8 9
     * 遍历顺序：
     * 3->5->7
     * 2->4
     * 1
     * </pre>
     *
     * @param arr
     */
    public static void printArr2(int[][] arr) {

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int k = len - i - 1;
            for (int j = 0; j < len - i; j++) {
                System.out.println(arr[j][k]);
                k--;
            }
        }
    }

    /**
     * <pre>
     *     1 2 3
     *     4 5 6
     *     7 8 9
     * 遍历顺序：
     * 1->5->9
     * 2->6
     * 3
     * </pre>
     *
     * @param arr
     */
    public static void printArr3(int[][] arr) {

        int len = arr.length;

        int c = 0;
        while (c < len) {
            int i = len - c;
            int j = len - i;
            for (int ki = 0; ki < i; ki++) {
                System.out.println(arr[ki][j]);
                j++;
            }
            c++;
        }

    }


    public static void printArr(int[][] arr) {
        for (int[] _arr : arr) {
            System.out.println(Arrays.toString(_arr));
        }
    }

}
