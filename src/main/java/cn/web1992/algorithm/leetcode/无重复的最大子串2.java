package cn.web1992.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author web1992
 * @date 2022/7/16
 */
public class 无重复的最大子串2 {
    public static void main(String[] args) {

        String str = "abcbbcbb";

        System.out.println(lengthOfLongestSubstring(str));
    }

    /**
     * 滑动窗口
     *
     * @param str 字符串
     * @return 无重复的最大子串
     * @link {https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/}
     */
    public static int lengthOfLongestSubstring(String str) {

        // map 计数
        Map<Character, Integer> map = new HashMap<>();

        int len = str.length();
        int maxLength = 0;

        int left = 0, right = 0;

        while (right < len) {
            char c = str.charAt(right);
            right++;
            map.merge(c, 1, Integer::sum);

            while (map.get(c) > 1) {
                char d = str.charAt(left);
                left++;
                map.merge(d, -1, Integer::sum);
            }

            maxLength = Math.max(maxLength, right - left);

        }

        return maxLength;
    }

}
