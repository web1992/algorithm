package cn.web1992.algorithm.leetcode.字符串;

/**
 * @author web1992
 * @date 2022/5/31  13:37
 * @link {https://leetcode.cn/problems/reverse-string-ii/solution/fan-zhuan-zi-fu-chuan-ii-by-leetcode-sol-ua7s/}
 * @link {https://leetcode.cn/problems/reverse-string-ii/}
 */
public class 反转字符串II {


    /**
     * <pre>
     *      输入：s = "abcdefg", k = 2
     *      输出："bacdfeg"
     * </pre>
     *
     * @param args
     */
    public static void main(String[] args) {

        String s = "abcdefg";
        String ans = new Solution().reverseStr(s, 2);
        System.out.println(ans);
    }

    static class Solution {

        public String reverseStr(String s, int k) {

            char[] chars = s.toCharArray();
            int len = chars.length;

            for (int i = 0; i < len; i += 2 * k) {

                int end = Math.min(i + k, len) - 1;
                reverse(chars, i, end);
            }

            return new String(chars);

        }

        /**
         * 上面的字符串反转，需要找到 start,end 的值，就可以正确的反转
         *
         * @param chars char数组
         * @param start 开始
         * @param end   结束
         */
        public void reverse(char[] chars, int start, int end) {
            while (start < end) {

                char ch = chars[start];
                chars[start] = chars[end];
                chars[end] = ch;

                start++;
                end--;
            }
        }
    }

}
