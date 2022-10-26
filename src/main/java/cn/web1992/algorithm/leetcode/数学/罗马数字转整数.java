package cn.web1992.algorithm.leetcode.数学;

import java.util.HashMap;
import java.util.Map;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn4n7c/}
 */
public class 罗马数字转整数 {


    public static void main(String[] args) {

        String str = "MCMXCIV";
        int i = new Solution().romanToInt(str);
        System.out.println(i);
    }

    /**
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */
    static class Solution {

        static Map<String, Integer> map = new HashMap<>();
        static Map<String, Integer> map2 = new HashMap<>();

        static {

            //            I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
            //            X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
            //            C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
            //

            map2.put("IV", 4);
            map2.put("IX", 9);
            map2.put("XL", 40);
            map2.put("XC", 90);
            map2.put("CD", 400);
            map2.put("CM", 900);

            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);
        }

        public int romanToInt(String s) {

            if (s.length() == 1) {
                return map.get(s);
            }

            if (s.length() == 2 && null != map2.get(s)) {
                return map2.get(s);
            }

            if (s.length() == 2) {
                String subStr1 = s.substring(0, 1);
                String subStr2 = s.substring(1, 2);
                return romanToInt(subStr1) + romanToInt(subStr2);
            }

            int ans = 0;
            int i = s.length();
            String s1 = s.substring(0, 2);
            if (map2.get(s1) != null) {
                ans = map2.get(s1);
                i = 2;
            } else {
                s1 = s.substring(0, 1);
                ans = map.get(s1);
                i = 1;
            }

            return ans + romanToInt(s.substring(i, s.length()));
        }
    }
}
