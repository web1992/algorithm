package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/15  10:29
 * @link {https://leetcode.cn/problems/container-with-most-water/}
 * @implNote 注意：求的是 最大的 水量
 */
public class 盛最多水的容器 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int ans = new Solution().maxArea(arr);
        System.out.println(ans);
    }

    static class Solution {

        // 双指针
        public int maxArea(int[] height) {
            int len = height.length;

            int left = 0;
            int right = len - 1;

            int ans = 0;
            while (left < right) {

                int lVal = height[left];
                int rVal = height[right];


                int n = 0;
                if (lVal > rVal) {
                    n = rVal * (right - left);// right - left 是R->L之间有多少个容器，不需要+1
                    right--;
                } else {
                    n = lVal * (right - left);
                    left++;
                }

                ans = Math.max(ans, n);
            }

            return ans;
        }
    }
}
