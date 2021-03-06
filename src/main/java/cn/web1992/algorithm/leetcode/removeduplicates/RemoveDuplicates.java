package cn.web1992.algorithm.leetcode.removeduplicates;

import java.util.stream.IntStream;

/**
 * @author web1992
 * @date 2020/2/26  15:31
 * @link {https://leetcode-cn.com/explore/featured/card/top-interview-questions-easy/1/array/21/}
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

        // 有序的数组
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 3, 3, 3};

        int count = removeDuplicates(arr);

        IntStream.range(0, count).forEach(System.out::println);
    }

    private static int removeDuplicates(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int count = 1;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                continue;
            }
            // 不相等，则移动
            numbers[count++] = numbers[i];
        }

        return count;
    }
}
