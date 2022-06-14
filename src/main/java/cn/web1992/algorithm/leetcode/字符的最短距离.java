package cn.web1992.algorithm.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/6/14  09:13
 * @link {https://leetcode.cn/problems/shortest-distance-to-a-character/}
 */
public class 字符的最短距离 {
    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';

        int[] arr = new Solution().shortestToChar(s, c);
        System.out.println(Arrays.toString(arr));
    }

    static class Solution {

        public int[] shortestToChar(String s, char c) {

            int len = s.length();
            int[] ans = new int[len];

            int idx = -len;// idx=-len,i-idx = i+len 可能是一个非法的值，会被后面的 min 中被替换，题目中s中一定包含c
            for (int i = 0; i < len; i++) {
                if (c == s.charAt(i)) {
                    idx = i;
                }
                ans[i] = i - idx;
            }


            idx = 2 * len;
            for (int i = len - 1; i >= 0; i--) {
                if (c == s.charAt(i)) {
                    idx = i;
                }
                ans[i] = Math.min(idx - i, ans[i]);
            }

            return ans;
        }
    }
}
