package cn.web1992.algorithm.leetcode.数组;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xmjzs7/}
 * @link {https://leetcode.cn/problems/search-a-2d-matrix-ii/solutions/1062538/sou-suo-er-wei-ju-zhen-ii-by-leetcode-so-9hcx/}
 */
public class 搜索二维矩阵II {

    public static void main(String[] args) {

    }

    class Solution {

        public boolean searchMatrix(int[][] matrix, int target) {

            for (int[] arr : matrix) {
                int index = search(arr, target);
                if (index >= 0) {
                    return true;
                }
            }
            return false;
        }

        private int search(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = (right - left) / 2 + left;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return -1;
        }
    }
}
