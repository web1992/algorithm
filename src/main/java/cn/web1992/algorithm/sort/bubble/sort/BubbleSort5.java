package cn.web1992.algorithm.sort.bubble.sort;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2020/3/5  21:49
 * 冒泡排序
 */
public class BubbleSort5 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 6, 72, 432, 234, 2, 9, -2, 0, -1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 思路： 每次比较+交换相邻位置的值
    private static void sort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            boolean sort = true;
            for (int j = 0; j < len - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    sort = false;
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }

            if (sort) {
                break;
            }
        }


    }

}
