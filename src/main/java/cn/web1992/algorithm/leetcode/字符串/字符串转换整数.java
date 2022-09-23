package cn.web1992.algorithm.leetcode.字符串;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnoilh/}
 */
public class 字符串转换整数 {

    public static void main(String[] args) {

        int i = new Solution().myAtoi("9223372036854775808");
        System.out.println(i);
    }


    static class Solution {

        public int myAtoi(String s) {

            int left = 0;
            int right = s.length();
            int sign = 1;
            int ans = 0;

            String str = s.toLowerCase();

            while (left < right) {

                // 去掉空格
                while (left < right && ' ' == str.charAt(left)) {
                    left++;
                }

                // 符号位
                while (left < right && !Character.isDigit(str.charAt(left))) {
                    if (str.charAt(left) == '-') {
                        sign = -1;
                        left++;
                        break;
                    } else if (str.charAt(left) == '+') {
                        left++;
                        break;
                    } else {
                        return 0;
                    }

                }

                // 数字
                while (left < right && Character.isDigit(str.charAt(left))) {
                    int t = ans * 10 + (sign * (str.charAt(left) - '0'));
                    if (t / 10 != ans) {
                        if (sign == -1) {
                            return Integer.MIN_VALUE;
                        } else {
                            return Integer.MAX_VALUE;
                        }
                    }
                    ans = t;
                    left++;
                }
                break;

            }
            return ans;
        }
    }
}
