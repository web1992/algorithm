package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/5/15  11:30
 * @link {https://leetcode-cn.com/problems/trapping-rain-water/}
 */
public class 接雨水Test02 {

    public static void main(String[] args) {
        // [4,2,0,3,2,5]
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("trap = " + new Solution().trap(arr));
    }


    static class Solution {

        // 动态规划
        // 用图把柱子画出来
        public int trap(int[] height) {

            int ans = 0;
            int len = height.length;

            int[] leftH = new int[len];
            int[] rightH = new int[len];

            leftH[0] = 0;
            rightH[len - 1] = 0;

            for (int i = 1; i < len; i++) {
                leftH[i] = Math.max(leftH[i - 1], height[i - 1]);
            }
            for (int i = len - 2; i > 0; i--) {

                rightH[i] = Math.max(rightH[i + 1], height[i + 1]);
                int min = Math.min(rightH[i], leftH[i]);

                if (min > height[i]) {
                    ans += min - height[i];
                }

            }

            return ans;
        }
    }


}
