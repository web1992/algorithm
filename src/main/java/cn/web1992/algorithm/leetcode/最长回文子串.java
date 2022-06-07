package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/5/3  15:48
 * @link {https://leetcode-cn.com/problems/longest-palindromic-substring/}
 * @link {https://leetcode.cn/problems/longest-palindromic-substring/solution/zhong-xin-kuo-san-fa-he-dong-tai-gui-hua-by-reedfa/}
 */
public class 最长回文子串 {


    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                // r - l <= 2 如果 s.charAt(r) == s.charAt(l) + （r - l <= 2） 成立，那么字符串一定是回文串，如 cbc ,l=0,r=2,arr[r]=c,arr[l]=c,
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;

                    }
                }

            }

        }
        return s.substring(maxStart, maxEnd + 1);

    }

}
