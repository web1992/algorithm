package cn.web1992.algorithm.leetcode.数学;

import java.util.Arrays;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnzlu6/}
 */
public class 计数质数 {

    public static void main(String[] args) {

    }

    class Solution {
        public int countPrimes(int n) {

            boolean[] temp = new boolean[n];
            Arrays.fill(temp, true);

            for (int i = 2; i < n; i++) {
                if (temp[i]) {
                    for (int j = 2; j * i < n; j++) {
                        temp[i * j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (temp[i]) count++;
            }
            return count;
        }
    }
}
