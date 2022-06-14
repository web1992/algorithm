package cn.web1992.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author web1992
 * @date 2022/6/14  09:13
 * @link {https://leetcode.cn/problems/shortest-distance-to-a-character/}
 * @link {https://www.bilibili.com/video/BV1h34y1Y7ec?share_source=copy_pc}
 */
public class 字符的最短距离 {
    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';

        int[] arr = new Solution().shortestToChar(s, c);
        System.out.println(Arrays.toString(arr));
    }

    // 两次遍历
    static class Solution {

        public int[] shortestToChar(String s, char c) {

            int len = s.length();
            int[] ans = new int[len];

            // idx 从 i->len (0->len)
            // idx 的最大值是len
            int idx = -len;
            for (int i = 0; i < len; i++) {
                if (c == s.charAt(i)) {
                    idx = i;
                }
                ans[i] = i - idx;
                System.out.println(ans[i]);
            }

            // idx 从 len-1 -> i
            // idx 最大是 2*len
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
