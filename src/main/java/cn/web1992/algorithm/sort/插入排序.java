package cn.web1992.algorithm.sort;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/4/18  10:20
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.println("sorted:" + Arrays.toString(arr));
    }


    // 插入排序（Insertion Sort）
    // 核心思路：在已经有序的部分，找到位置，插入(数据需要后移)
    public static void sort(int[] arr) {


        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            int val = arr[i];

            for (; j >= 0; j--) {

                if (arr[j] > val) {
                    arr[j + 1] = arr[j];// 移动（向后面移动）
                } else {
                    break;// 前面的数据已经有序了，需要break
                }
            }

            // 插入， 这个操作是理解的难点
            arr[j + 1] = val;

            System.out.println();
        }
    }
}
