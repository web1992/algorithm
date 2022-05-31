package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/5/31  11:35
 * @link {https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/} 此题是 左旋字符串
 */
public class 右旋转字符串Test01 {

    public static void main(String[] args) {

        // len=7
        String str = reverseRightWords("abcdefg", 2);

        System.out.println("str=" + str);
    }


    // fg abcde
    public static String reverseRightWords(String s, int n) {

        char[] chars = s.toCharArray();

        int len = s.length();
        // 下标 从0开始，因此 n-1
        reverse(chars, len - n, len - 1);
        reverse(chars, 0, len - n - 1);
        reverse(chars, 0, len - 1);

        return new String(chars);
    }

    public static void reverse(char[] chars, int start, int end) {

        while (start < end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;

            start++;
            end--;

        }
    }

}
