package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/5/31  11:35
 * @link {https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/}
 */
public class 左旋转字符串Test01 {

    public static void main(String[] args) {

        String str = reverseLeftWords("abcdefg", 2);

        System.out.println("str=" + str);
    }


    public static String reverseLeftWords(String s, int n) {

        char[] chars = s.toCharArray();

        // 下标 从0开始，因此 n-1
        reverse(chars, 0, n - 1);
        reverse(chars, n, s.length() - 1);
        reverse(chars, 0, s.length() - 1);

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
