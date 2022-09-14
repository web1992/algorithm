package cn.web1992.algorithm.sort;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/4/18  10:20
 * @link {https://time.geekbang.org/column/article/42038?screen=full}
 * @implNote 计数排序（Counting sort）
 * @implNote min - max  范围值太大 就不适合用 计数排序了
 */
public class 计数排序 {


    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 3, 0, 2, 3, 0, 3};
        countingSort(arr);
        System.out.println("after sort " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {

        // 获取最大的数
        int max = getMax(arr);
        int[] scoreCount = new int[max + 1];

        // 计数
        for (int i = 0; i < arr.length; i++) {
            scoreCount[arr[i]]++;
        }

        // sum
        for (int i = 1; i < scoreCount.length; i++) {
            scoreCount[i] = scoreCount[i - 1] + scoreCount[i];
        }

        int[] temp = new int[arr.length];

        // 关键
        for (int i = arr.length - 1; i >= 0; i--) {
            int curNum = arr[i];
            int index = scoreCount[curNum] - 1;
            temp[index] = curNum;
            // 计数信息更新 -1
            scoreCount[curNum]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
