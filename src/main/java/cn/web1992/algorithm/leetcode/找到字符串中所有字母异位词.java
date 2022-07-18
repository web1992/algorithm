package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author web1992
 * @date 2022/7/17  23:25
 * @link {https://leetcode.cn/problems/find-all-anagrams-in-a-string/}
 */
public class 找到字符串中所有字母异位词 {


    public static void main(String[] args) {

        String s = "cbaebabacd", p = "abc";
        List<Integer> ans = new Solution().findAnagrams(s, p);

        for (Integer an : ans) {
            System.out.println(an);
        }

    }

    /**
     * 输入: s = "cbaebabacd", p = "abc"
     * 输出: [0,6]
     */
    static class Solution {

        // 滑动窗口
        public List<Integer> findAnagrams(String s, String p) {

            List<Integer> ans = new ArrayList<>();
            // 计数
            Map<Character, Integer> need = new HashMap<>();
            Map<Character, Integer> window = new HashMap<>();

            for (int i = 0; i < p.length(); i++) {
                need.merge(p.charAt(i), 1, Integer::sum);
            }


            int left = 0, right = 0;
            int valid = 0;

            while (right < s.length()) {

                char c = s.charAt(right);
                right++;

                if (null != need.get(c)) {
                    window.merge(c, 1, Integer::sum);
                    if (need.get(c).equals(window.get(c))) {
                        valid++;
                    }
                }

                // 这里，不能使用 valid == need.size() 这个相等进行判断，比如 abcb,此时并不是 【字母异位词】
                while (right - left == p.length()) {
                    if (valid == need.size()) {// 【len 相等】 + 【valid 相等】
                        ans.add(left);
                    }

                    char cc = s.charAt(left);
                    System.out.println("valid=" + valid + " cc=" + cc + " need=" + need + " sub str =" + s.substring(left, right));
                    left++;

                    if (null != need.get(cc)) {
                        if (need.get(cc).equals(window.get(cc))) {
                            valid--;
                        }
                        window.merge(cc, -1, Integer::sum);
                    }
                }

            }

            return ans;
        }
    }
}
