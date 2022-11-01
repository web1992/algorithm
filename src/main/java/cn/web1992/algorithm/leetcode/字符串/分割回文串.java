package cn.web1992.algorithm.leetcode.字符串;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xaxi62/}
 * @link {https://programmercarl.com/0131.%E5%88%86%E5%89%B2%E5%9B%9E%E6%96%87%E4%B8%B2.html#java}
 */
public class 分割回文串 {

    public static void main(String[] args) {

        List<List<String>> ans = new Solution().partition("aab");

        for (List<String> an : ans) {
            System.out.println(an);
        }
    }

    static class Solution {

        List<List<String>> ans = new ArrayList<>();
        Deque<String> path = new LinkedList<>();

        public List<List<String>> partition(String s) {

            partition(s, 0);
            return ans;
        }

        public void partition(String str, int startIndex) {
            if (startIndex >= str.length()) {
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int i = startIndex; i < str.length(); i++) {

                if (isPalindrome(str, startIndex, i)) {
                    String subStr = str.substring(startIndex, i + 1);
                    path.addLast(subStr);
                } else {
                    continue;
                }

                // 处理子串
                partition(str, i + 1);
                //System.out.println("path=" + path);
                path.removeLast();
            }


        }

        public boolean isPalindrome(String s, int start, int end) {

            if (s.length() <= 1) {
                return true;
            }

            int left = start;
            int right = end;

            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;

        }
    }
}
