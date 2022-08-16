package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/15  10:21
 * @link {https://leetcode.cn/problems/palindrome-number/}
 */
public class 回文数 {

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

            // x =123
            while (x > num) {// 比x>0, 循环的次数会少很多
                int t = x % 10;// 取模
                num = num * 10 + t;
                x /= 10; // 取整
                System.out.println("x=" + x + " num=" + num);
            }
            return num == x || num / 10 == x;// num/10 -> 121 这种case
        }
    }
}
