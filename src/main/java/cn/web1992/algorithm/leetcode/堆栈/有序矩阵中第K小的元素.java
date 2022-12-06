package cn.web1992.algorithm.leetcode.堆栈;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xaicbc/}
 * @link {https://leetcode.cn/problems/kth-smallest-element-in-a-sorted-matrix/solutions/311472/you-xu-ju-zhen-zhong-di-kxiao-de-yuan-su-by-leetco/}
 */
public class 有序矩阵中第K小的元素 {


    static class Solution {

        public int kthSmallest(int[][] matrix, int k) {

            int len = matrix.length;

            int left = matrix[0][0];
            int right = matrix[len - 1][len - 1];

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (check(matrix, mid, k, len)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }

            }

            return left;
        }

        public boolean check(int[][] matrix, int mid, int k, int n) {

            int i = n - 1;
            int j = 0;
            int num = 0;

            while (i >= 0 && j < n) {

                // matrix[i][j] = 从左下角开始
                if (matrix[i][j] <= mid) {
                    num += i + 1;
                    j++;// 矩阵中向右走
                } else {
                    i--;// 矩阵中向上走
                }
            }
            // ..k...mid.......
            // ......mid...k....
            // 小于mid 的数的个数 大于 k，说明 k 在mid 的左边
            return num >= k;
        }

    }
}
