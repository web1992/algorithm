package cn.web1992.algorithm.leetcode.test;

/**
 * @author wangjunwei87
 * @since 2019-03-10
 */
public class KthSmallestTest01 {

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 99, 33, 1, -3, 4, 11, 22, 34, -1};
        // [-3, -2, -1, 1, 4, 11, 22, 33, 34, 99]
        System.out.println("findK=" + kthSmallest(arr, 4));
    }

    public static int kthSmallest(int[] arr, int k) {

        if (arr.length == 0 || k > arr.length) {
            return -1;
        }

        int partitionIndex = partition(arr, 0, arr.length - 1);

        // partitionIndex ....k....len
        while (partitionIndex + 1 != k) {
            if (partitionIndex + 1 > k) {
                partitionIndex = partition(arr, 0, partitionIndex - 1);
            } else {
                partitionIndex = partition(arr, partitionIndex + 1, arr.length - 1);
            }
        }

        return arr[partitionIndex];
    }


    public static int partition(int[] arr, int start, int end) {

        int val = arr[end];
        int i = start;

        for (int j = i; j < end; j++) {
            if (arr[j] <= val) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, end);

        return i;
    }


    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
