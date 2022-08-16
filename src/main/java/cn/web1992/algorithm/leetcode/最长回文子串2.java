package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/5/3  15:48
 * @link {https://leetcode-cn.com/problems/longest-palindromic-substring/}
 * @link {https://leetcode.cn/problems/longest-palindromic-substring/solution/zhong-xin-kuo-san-fa-he-dong-tai-gui-hua-by-reedfa/}
 * @see 回文子串
 */
public class 最长回文子串2 {


    public static void main(String[] args) {

        String str = "babad";
        String ans = longestPalindrome(str);
        System.out.println(ans);
    }

    /**
     * @param s
     * @return
     * @see 回文子串 参考 回文子串 这个写的
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int i = strLen; i >= 0; i--) {
            for (int j = i; j < strLen; j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1 || (dp[i + 1][j - 1])) {// j,i 相等，或者间隔相差1 or 上一个格子是 回文子串
                        dp[i][j] = true;
                        if (j - i >= maxLen) {// 这里是倒着遍历的，因此需要>=
                            maxStart = i;
                            maxEnd = j;
                            maxLen = j - i;
                        }
                    }
                }
            }

        }
        // substring  不包含 endIndex  因此需要加+1
        return s.substring(maxStart, maxEnd + 1);

    }

}
