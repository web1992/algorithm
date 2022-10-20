package cn.web1992.algorithm.leetcode.数组;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xnto1s/}
 */
public class 第一个错误的版本 {

    public static void main(String[] args) {

    }

    static public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 0;
            int right = n;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }

            }
            return left;
        }
    }

    static class VersionControl {
        boolean isBadVersion(int version) {
            return false;
        }
    }
}
