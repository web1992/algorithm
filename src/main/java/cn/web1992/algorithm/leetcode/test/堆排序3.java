package cn.web1992.algorithm.leetcode.test;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/4/18  10:21
 * @link {https://time.geekbang.org/column/article/69913}
 * <pre>
 *  堆的应用：优先级队列、求 Top K 和求中位数。
 * </pre>
 */
public class 堆排序3 {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 10, 3, 5, 1, 2};
        sort(arr);
        System.out.println("sorted:" + Arrays.toString(arr));
    }


    public static void sort(int[] arr) {

        buildHeap(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }

    }

    /**
     * <pre>
     *      5
     *     | \
     *     3  4
     * </pre>
     *
     * @param arr         数组
     * @param len         数组长度
     * @param parentIndex 从哪个元素开始 堆化
     * @implNote 数组 堆化
     */
    public static void heapify(int[] arr, int len, int parentIndex) {

        int maxI = parentIndex;

        int c1 = 2 * parentIndex + 1;
        int c2 = c1 + 1;

        if (c1 < len && arr[c1] > arr[maxI]) {
            maxI = c1;
        }

        if (c2 < len && arr[c2] > arr[maxI]) {
            maxI = c2;
        }

        if (maxI != parentIndex) {
            swap(arr, maxI, parentIndex);
            heapify(arr, len, maxI);
        }
    }


    public static void buildHeap(int[] arr) {


        int lastIndex = arr.length - 1;
        int parentIndex = (lastIndex - 1) / 2;

        for (int i = parentIndex; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

    }


    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
