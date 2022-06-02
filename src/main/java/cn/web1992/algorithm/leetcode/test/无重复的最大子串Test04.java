package cn.web1992.algorithm.leetcode.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author web1992
 * @date 2022/3/7  9:18 下午
 * @link {https://www.bilibili.com/video/BV1um4y1Z7oE}
 * @link {https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/}
 */
public class 无重复的最大子串Test04 {
    public static void main(String[] args) {

        String str = "abcbbcbb";

        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String str) {

        int maxLength = 0;
        int start = 0;

        Map<Character, Integer> countMap = new HashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            countMap.merge(ch, 1, Integer::sum);

            while (countMap.get(ch) > 1) {
                countMap.merge(str.charAt(start), -1, Integer::sum);
                start++;
            }

            maxLength = Math.max(maxLength, i - start + 1);

        }

        return maxLength;
    }

}
