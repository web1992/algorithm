package cn.web1992.algorithm.leetcode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xah8k6/}
 */
public class 验证回文串Test01 {

    public static void main(String[] args) {

        String str = "race a car";
        boolean palindrome = new Solution().isPalindrome(str);
        System.out.println(palindrome);
    }


    static class Solution {
        public boolean isPalindrome(String s) {

            if (s.length() <= 1) {
                return true;
            }

            char[] chars = s.toCharArray();

            int len = chars.length;
            int left = 0;
            int right = len - 1;

            while (left < right) {


                while (!Character.isLetterOrDigit(chars[left]) && left < right) {
                    left++;
                }

                while (!Character.isLetterOrDigit(chars[right]) && left < right) {
                    right--;
                }

                if (Character.toUpperCase(chars[left]) != Character.toUpperCase(chars[right])) {
                    return false;
                }
                left++;
                right--;
            }

            return true;

        }
    }

}
