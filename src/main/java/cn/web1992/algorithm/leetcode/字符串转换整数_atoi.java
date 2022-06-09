package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/9  21:46
 * @link {https://leetcode.cn/problems/string-to-integer-atoi/}
 */
public class 字符串转换整数_atoi {

    public static void main(String[] args) {

        int ans = new Solution().myAtoi("-+12");
        int ans1 = new Solution().myAtoi("+-12");
        int ans2 = new Solution().myAtoi("00000-42a1234");
        int ans3 = new Solution().myAtoi("   +0 123");
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static class Solution {

        public int myAtoi(String s) {

            int ans = 0;
            int flag = 1;
            boolean hadFlag = false;
            boolean hadDigit = false;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == ' ') {
                    if (hadFlag || hadDigit) {
                        break;
                    }
                    continue;
                }
                if (ch == '-') {
                    if (hadFlag || hadDigit) {
                        break;
                    }
                    flag = -1;
                    hadFlag = true;
                    continue;
                }
                if (ch == '+') {
                    if (hadFlag || hadDigit) {
                        break;
                    }
                    hadFlag = true;
                    continue;
                }
                if (!Character.isDigit(ch)) {
                    break;
                }
                hadDigit = true;
                int t = (ch - '0');
                if ((ans * 10 + t) / 10 != ans) {
                    return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans = ans * 10 + t;

            }

            return flag * ans;
        }
    }
}
