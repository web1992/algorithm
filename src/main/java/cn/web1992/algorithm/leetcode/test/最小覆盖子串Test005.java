package cn.web1992.algorithm.leetcode.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author web1992
 * @implNote 最小覆盖子串
 * @link {https://www.bilibili.com/video/BV1qX4y1V7EC}
 * @link {https://leetcode-cn.com/problems/minimum-window-substring/}
 * @date 2022/2/25  9:29 下午
 */
public class 最小覆盖子串Test005 {
    public static void main(String[] args) {
        String target = "ABC";
        String searchTxt = "ADOBECODEBANC";

        String search = minWindow(searchTxt, target);
        System.out.println(search);
    }


    /**
     * 输入：s = "ADOBECODEBANC", t = "ABC"
     * 输出："BANC"
     *
     * @param maxStr
     * @param minStr
     * @return
     */
    public static String minWindow(String maxStr, String minStr) {

        if (maxStr.length() < minStr.length()) {
            return "";
        }

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < minStr.length(); i++) {
            char c = minStr.charAt(i);
            countMap.merge(c, 1, Integer::sum);
        }


        int left = 0;
        int right = 0;
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;

        Map<Character, Integer> map = new HashMap<>();
        while (right <= maxStr.length() - 1) {

            System.out.println("right=" + right);
            char c = maxStr.charAt(right);
            if (countMap.containsKey(c)) {
                map.merge(c, 1, Integer::sum);
            }

            while (match(countMap, map)) {
                if ((right - left) < min) {
                    start = left;
                    end = right;
                    min = right - left;
                }
                if (countMap.get(maxStr.charAt(left)) != null) {
                    map.merge(maxStr.charAt(left), -1, Integer::sum);
                }
                left++;
            }

            right++;
        }

        return min == Integer.MAX_VALUE ? "" : maxStr.substring(start, end + 1);
    }

    private static boolean match(Map<Character, Integer> countMap, Map<Character, Integer> map) {


        for (Character ch : countMap.keySet()) {
            if (null == map.get(ch) || countMap.get(ch) > map.get(ch)) {
                return false;
            }
        }

        return true;
    }


}
