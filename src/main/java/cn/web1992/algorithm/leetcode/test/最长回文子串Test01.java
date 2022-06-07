package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/6/7  11:17
 * @link {https://leetcode-cn.com/problems/longest-palindromic-substring/}
 */
public class 最长回文子串Test01 {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {

        int len = s.length();
        int maxStart = 0;
        int maxEnd = 0;
        int maxLen = 1;

        boolean[][] dp = new boolean[len][len];

        for (int r = 1; r < len; r++) {
            for (int l = 0; l < r; l++) {
                // r - l <= 2 如果 s.charAt(r) == s.charAt(l) + （r - l <= 2） 成立，那么字符串一定是回文串，如 cbc ,l=0,r=2,arr[r]=c,arr[l]=c,
                if (s.charAt(r) == s.charAt(l) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (maxLen < r - l + 1) {
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
