package cn.web1992.algorithm.leetcode.二进制;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnc5vg/}
 */
public class 颠倒二进制位 {


    public static void main(String[] args) {

    }

    public class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int res = 0;
            for (int i = 0; i < 32; i++) {
                res <<= 1;
                res |= (n & 1);
                n >>= 1;
            }
            return res;
        }
    }

}
