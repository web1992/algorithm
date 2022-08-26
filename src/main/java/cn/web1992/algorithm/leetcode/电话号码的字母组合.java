package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @link {https://leetcode.cn/problems/letter-combinations-of-a-phone-number/}
 * @link {https://programmercarl.com/0017.%E7%94%B5%E8%AF%9D%E5%8F%B7%E7%A0%81%E7%9A%84%E5%AD%97%E6%AF%8D%E7%BB%84%E5%90%88.html}
 */
public class 电话号码的字母组合 {

    public static void main(String[] args) {

        // 输入：digits = "23"
        // 输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]

        String digits = "23";
        List<String> strings = new Solution().letterCombinations(digits);
        System.out.println(strings.toString());

    }


    static class Solution {

        static Map<String, List<String>> map = new HashMap<>();

        List<String> ans = null;
        LinkedList<String> path = null;

        static {
            map.put("2", Arrays.asList("a", "b", "c"));
            map.put("3", Arrays.asList("d", "e", "f"));
            map.put("4", Arrays.asList("g", "h", "i"));
            map.put("5", Arrays.asList("j", "k", "l"));
            map.put("6", Arrays.asList("m", "n", "o"));
            map.put("7", Arrays.asList("p", "q", "r", "s"));
            map.put("8", Arrays.asList("t", "u", "v"));
            map.put("9", Arrays.asList("w", "x", "y", "z"));
        }

        public List<String> letterCombinations(String digits) {

            if (null == digits || digits.length() == 0) {
                return new ArrayList<>();
            }

            ans = new ArrayList<>();
            path = new LinkedList<>();

            int len = digits.toCharArray().length;
            // 2,3 =>  abc,def
            do_letterCombinations(len, 0, digits);
            return ans;
        }


        public void do_letterCombinations(int n, int startIndex, String digits) {

            if (n == path.size()) {
                ans.add(String.join("", path));
                return;
            }

            // 2,3 =>  abc,def
            String ch = String.valueOf((digits.charAt(startIndex)));
            List<String> chList = map.get(ch);
            // System.out.println(ch);

            for (String str : chList) {// ch=2,chList=abc
                path.add(str);
                do_letterCombinations(n, startIndex + 1, digits);
                path.removeLast();
            }

        }
    }
}
