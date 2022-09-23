package cn.web1992.algorithm.leetcode.字符串;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xne8id/}
 */
public class 验证回文串 {

    public static void main(String[] args) {

    }


    static class Solution {

        public boolean isPalindrome(String s) {

            int left = 0;
            int right = s.length() - 1;

            String str = s.toLowerCase();
            while (left < right) {


                while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                    left++;
                }
                while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                    right--;
                }

                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }
}
