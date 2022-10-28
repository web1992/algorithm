package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xmup75/}
 */
public class 鸡蛋掉落 {

    public static void main(String[] args) {

        int k = 3;
        int n = 14;
        int ans = new Solution().superEggDrop(k, n);
        System.out.println(ans);
    }

    static class Solution {
        // k=鸡蛋个数
        // n=楼层数
        public int superEggDrop(int k, int n) {

            int left = 0;
            int right = n - 1;
            return count(k, left, right);
        }

        public int count(int k, int left, int right) {
            if (left <= right) {
                int mid = left + right / 2;
                return count(k, left, mid) + count(k, mid + 1, right);
            }
            return 1;
        }
    }
}
