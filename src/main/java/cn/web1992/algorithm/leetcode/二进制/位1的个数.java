package cn.web1992.algorithm.leetcode.二进制;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xn1m0i/}
 */
public class 位1的个数 {

    public static void main(String[] args) {

        int num = Integer.parseInt("11111111111111111111111111111101", 2);
        int ans = new Solution().hammingWeight(num);
        System.out.println(ans);
    }


    static public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {

            int count = 0;

            for (int i = 0; i < 32; i++) {
               if( (n>>>i & 1)!=0){
                   count++;
               }
            }

            return count;
        }
    }
}
