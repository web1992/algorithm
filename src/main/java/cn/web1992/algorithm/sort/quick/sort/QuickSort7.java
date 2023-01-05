package cn.web1992.algorithm.sort.quick.sort;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2021/1/4
 * 快速排序
 */
public class QuickSort7 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 72, 432, 234, 2, 9, -2, 0, -1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        sort0(arr, 0, arr.length - 1);
    }

    // 找到p点，小于p点的放在左边，大于p点的放在右边
    private static void sort0(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }

        int p = part(arr, left, right);
        sort0(arr, left, p - 1);
        sort0(arr, p + 1, right);

    }

    // 5,4,3,0,1,2
    private static int part(int[] arr, int left, int right) {
        int val = arr[right];
        int p = left;

        for (int i = left; i < right; i++) {
            if (arr[i] < val) {
                swap(arr, i, p);// i >=p,i 每次循环都+1，p 只有在满足条件的时候才+1，swap(arr,i,p) 相当于把i的值向p的右侧移动
                p++;
            }
        }
        swap(arr, p, right);
        return p;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
