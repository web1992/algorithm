package cn.web1992.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/5/21  18:13
 * @link {https://leetcode.cn/problems/spiral-matrix-ii/}
 * @link {https://programmercarl.com/0059.%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5II.html#_59-%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5ii}
 * @link {https://leetcode.cn/problems/spiral-matrix-ii/solution/luo-xuan-ju-zhen-ii-by-leetcode-solution-f7fp/}
 */
public class 螺旋矩阵II {

    public static void main(String[] args) {

        int[][] ints = new Solution().generateMatrix(6);
        for (int[] arr : ints) {
            System.out.println(Arrays.toString(arr));
        }
    }

    static class Solution {

        // up -> right -> down -> left -> up ...
        // 1  2  3
        // 8  9  4
        // 7  6  5
        public int[][] generateMatrix(int n) {

            // [行][列]
            int[][] ans = new int[n][n];
            int up = 0, down = n - 1, left = 0, right = n - 1, index = 1;

            while (index <= n * n) {

                for (int i = left; i <= right; i++) {
                    ans[up][i] = index++;
                }
                up++;

                for (int i = up; i <= down; i++) {
                    ans[i][right] = index++;
                }
                right--;

                for (int i = right; i >= left; i--) {
                    ans[down][i] = index++;
                }
                down--;

                for (int i = down; i >= up; i--) {
                    ans[i][left] = index++;
                }
                left++;

            }
            return ans;
        }
    }
}
