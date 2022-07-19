package cn.web1992.algorithm.sort.quick.sort;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2021/1/4
 * @link {https://blog.csdn.net/qq_36528114/article/details/78667034}
 * @implNote 左右指针方法
 * 快速排序
 */
public class QuickSort5 {

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

    /**
     * @param arr
     * @param left
     * @param right
     * @return
     * @implNote 左右指针方法
     */
    private static int part(int[] arr, int left, int right) {
        int ri = right;// 选取最后一个值，作为区分 key
        int key = arr[ri];

        while (left < right) {

            while (left < right && arr[left] <= key) {
                left++;
            }

            while (left < right && arr[right] >= key) {
                right--;
            }
            swap(arr, left, right);
        }

        swap(arr, left, ri);

        //System.out.println("left=" + left + " right=" + right);
        return left;
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
