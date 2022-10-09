package cn.web1992.algorithm.leetcode.字符串;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnpvdm/}
 */
public class 外观数列 {

    public static void main(String[] args) {

        int n = 4;
        String ans = new Solution().countAndSay(n);
        System.out.println(ans);
    }

    static class Solution {
        public String countAndSay(int n) {

            if (n == 1) {
                return "1";
            }

            String pre = countAndSay(n - 1);

            StringBuilder sb = new StringBuilder();

            int count = 0;
            char t = pre.charAt(0);
            for (int i = 0; i < pre.length(); i++) {

                if (t == pre.charAt(i)) {
                    count++;
                } else {
                    sb.append(count).append(t);
                    count = 1;
                    t = pre.charAt(i);
                }
            }

            sb.append(count).append(t);
            return sb.toString();
        }

    }
}
