package cn.web1992.algorithm.sort.merge.sort;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/1/6  9:17 下午
 */
public class MergeSort6 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 72, 432, 234, 2, 9, -2, 0, -1, -2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void sort(int[] arr) {
        sort0(arr, 0, arr.length - 1);
    }

    public static void sort0(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int min = (left + right) / 2;

        sort0(arr, left, min);
        sort0(arr, min + 1, right);
        merge(arr, left, min, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        // 临时数组
        int[] temp = new int[arr.length];
        int i = left;
        int leftIndex = left;
        int rightIndex = mid + 1;
        while (leftIndex <= mid && rightIndex <= right) {

            if (arr[leftIndex] > arr[rightIndex]) {
                temp[i++] = arr[rightIndex++];
            } else {
                temp[i++] = arr[leftIndex++];
            }
        }

        while (leftIndex <= mid) {
            temp[i++] = arr[leftIndex++];
        }
        while (rightIndex <= right) {
            temp[i++] = arr[rightIndex++];
        }

        // 复制数据，从left下标处开始
        while (left <= right) {
            arr[left] = temp[left++];
        }

    }

}
