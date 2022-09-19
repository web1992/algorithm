package cn.web1992.algorithm.leetcode;

public class 加一 {

    public static void main(String[] args) {

    }

    static class Solution {
        public int[] plusOne(int[] digits) {

            int start = digits.length - 1;
            for (int i = start; i >= 0; i--) {
                if (digits[i] != 9) {
                    //   !=9
                    digits[i]++;
                    // 存在一个不等于9 的就返回,不全是9 表示不会进位
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }

            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
    }
}
