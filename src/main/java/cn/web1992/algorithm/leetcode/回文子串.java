package cn.web1992.algorithm.leetcode;

/**
 * @link {https://leetcode.cn/problems/palindromic-substrings/}
 * @desc 回文子串 的数目
 */
public class 回文子串 {

    public static void main(String[] args) {

        String str = "abc";
        int ans = new Solution().countSubstrings(str);

        System.out.println(ans);
    }

    static class Solution {
        public int countSubstrings(String s) {

            int ans = 0;
            if (s == null || s.length() == 0) {
                return ans;
            }


            int len = s.length();
            boolean[][] dp = new boolean[len][len];

            for (int i = len; i >= 0; i--) {
                for (int j = i; j < len; j++) {
                    // 相等
                    if (s.charAt(i) == s.charAt(j)) {
                        if (i == j || j - i == 1) {// i,j 相等 or i,j间隔差1
                            ans++;
                            dp[i][j] = true;
                        } else {
                            // i,j 间隔大于0,1
                            if (dp[i + 1][j - 1]) {
                                ans++;
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }

            return ans;
        }
    }
}
