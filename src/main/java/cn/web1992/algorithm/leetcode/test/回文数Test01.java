package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/6/15  10:21
 * @link {https://leetcode.cn/problems/palindrome-number/}
 */
public class 回文数Test01 {

    public static void main(String[] args) {

        boolean ans = new Solution().isPalindrome(121);
        System.out.println(ans);
    }

    static class Solution {

        public boolean isPalindrome(int x) {

            if (x < 0) {
                return false;
            }

            if (x % 10 == 0 && x != 0) {
                return false;
            }

            int num = 0;

            while (x > num) {
                int t = x % 10;
                num = num * 10 + t;
                x /= 10;
            }

            return x == num || num / 10 == x;// 121
        }
    }
}
