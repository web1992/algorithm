package cn.web1992.algorithm.leetcode.二进制;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnyode/}
 */
public class 汉明距离 {
    public static void main(String[] args) {

    }

    static class Solution {
        public int hammingDistance(int x, int y) {

            int xor = x ^ y;
            int count = 0;

            while (xor != 0) {
                xor = xor & (xor - 1);
                count++;
            }

            return count;
        }
    }
}
