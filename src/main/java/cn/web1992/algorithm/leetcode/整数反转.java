package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/9  09:09
 * @link {https://leetcode.cn/problems/reverse-integer/}
 * @link {https://www.jianshu.com/p/3b19b9fc030e}
 * @see Math#addExact 参考此方法是如果 处理溢出的
 */
public class 整数反转 {

    public static void main(String[] args) {
        int ans = new Solution().reverse(-10);
        System.out.println(ans);
    }

    static class Solution {

        public int reverse(int x) {

            int ans = 0;
            if (x == 0) {
                return ans;
            }

            while (x != 0) {

                int t = x % 10;
                // 溢出判断
                if ((ans * 10 + t) / 10 != ans) {
                    return 0;
                }

                x /= 10;
                ans = ans * 10 + t;
            }

            return ans;
        }
    }
}
