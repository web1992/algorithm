package cn.web1992.algorithm.leetcode.数学;

import java.util.ArrayList;
import java.util.List;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xngt85/}
 */
public class FizzBuzz {

    public static void main(String[] args) {

    }

    class Solution {
        public List<String> fizzBuzz(int n) {

            List<String> ans = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                ans.add(getStr(i));
            }
            return ans;
        }

        public String getStr(int n) {

            // FizzBuzz
            if (n % 3 == 0) {
                if (n % 5 == 0) {
                    return "FizzBuzz";
                }
                return "Fizz";
            }
            if (n % 5 == 0) {
                return "Buzz";
            } else {
                return n + "";
            }
        }
    }
}
