package cn.web1992.algorithm.leetcode.数学;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnsdi2/}
 */
public class _3的幂 {

    public static void main(String[] args) {

    }

    class Solution {
        public boolean isPowerOfThree(int n) {

            if (n > 0) {
                return n == 1 || (n % 3 == 0 && isPowerOfThree(n / 3));
            }
            return false;
        }
    }
}
