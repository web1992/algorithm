package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2f9gg/}
 */
public class 有效的数独 {

    public static void main(String[] args) {

    }

    static class Solution {

        public boolean isValidSudoku(char[][] board) {

            int len = board.length;
            int[][] column = new int[len][len];
            int[][] row = new int[len][len];
            int[][] cell = new int[len][len];

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    }
                    // char to int
                    // 数字的值范围： 1-9  ，减1，转换成 0-8 ，数组下标不会越界
                    int num = board[i][j] - '0' - 1;
                    int k = i / 3 * 3 + j / 3;// 计算单元格

                    if (column[i][num] != 0 || row[j][num] != 0 || cell[k][num] != 0) {
                        return false;
                    }
                    // 更新标记:
                    // column 第i列有num这个数字
                    // row 第j行有num这个数字
                    // cell 第k个九宫格有num这个数字
                    column[i][num] = row[j][num] = cell[k][num] = 1;

                }
            }

            return true;
        }

    }

}
