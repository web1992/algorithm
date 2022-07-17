package cn.web1992.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author web1992
 * @implNote 最小覆盖子串
 * @link {https://leetcode-cn.com/problems/minimum-window-substring/}
 * @date 2022/2/25  9:29 下午
 */
public class 最小覆盖子串3 {

    public static void main(String[] args) {
        String target = "ABC";
        String searchTxt = "ADOBECODEBANC";

        String search = new Solution().minWindow(searchTxt, target);
        System.out.println(search);
    }


    /**
     * 滑动窗口
     */
    static class Solution {

        public String minWindow(String s, String t) {

            int sLen = s.length();
            Map<Character, Integer> needMap = new HashMap<>();
            Map<Character, Integer> window = new HashMap<>();
            for (char c : t.toCharArray()) {
                needMap.merge(c, 1, Integer::sum);
            }
            System.out.println("needMap=" + needMap);

            int left = 0;
            int right = 0;
            int valid = 0;
            int start = 0;
            int maxLen = Integer.MAX_VALUE;

            while (right < sLen) {

                // 移动 right 指针
                char _s = s.charAt(right);
                right++;

                if (needMap.get(_s) != null) {
                    // _s 在needMap 中存在，更新window的计数
                    window.merge(_s, 1, Integer::sum);

                    if (window.get(_s).equals(needMap.get(_s))) {
                        // 计数相等了，valid +1
                        valid++;
                    }
                }

                while (valid == needMap.size()) {
                    if (right - left < maxLen) {
                        start = left;
                        maxLen = right - left;
                    }

                    // 移动 left 指针
                    char _ss = s.charAt(left);
                    left++;

                    Integer tVal = needMap.get(_ss);
                    if (tVal != null) {
                        if (tVal.equals(window.get(_ss))) {
                            valid--;
                        }
                        window.merge(_ss, -1, Integer::sum);

                    }
                }
            }

            return maxLen == Integer.MAX_VALUE ? "" : s.substring(start, start + maxLen);
        }
    }


}
