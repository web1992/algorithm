package cn.web1992.algorithm.leetcode.test;


/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnr003/}
 * @link {https://programmercarl.com/0028.%E5%AE%9E%E7%8E%B0strStr.html}
 */
public class 实现strStrTest03 {
    public static void main(String[] args) {

        String haystack = "sadbutsad", needle = "sad";

        int i = new Solution().strStr(haystack, needle);
        System.out.println(i);
    }

    static class Solution {

        public int strStr(String haystack, String needle) {

            if (needle.length() == 0) {
                return 0;
            }

            if (needle.length() > haystack.length()) {
                return -1;
            }

            int[] next = getNext(needle);
            char[] chars = haystack.toCharArray();

            int j = -1;
            for (int i = 0; i < haystack.length(); i++) {

                while (j >= 0 && chars[i] != needle.charAt(j + 1)) {
                    j = next[i];
                }

                if (chars[i] == needle.charAt(j + 1)) {
                    j++;
                }

                if (j == needle.length() - 1) {
                    return i - needle.length() + 1;
                }
            }


            return -1;
        }


        public int[] getNext(String str) {

            int[] nextArr = new int[str.length()];
            int j = -1;
            nextArr[0] = j;

            char[] chars = str.toCharArray();

            for (int i = 1; i < chars.length; i++) {

                while (j >= 0 && chars[i] != chars[j + 1]) {
                    j = nextArr[j];
                }

                if (chars[i] == chars[j + 1]) {
                    j++;
                }
                nextArr[i] = j;

            }

            return nextArr;

        }
    }

}
