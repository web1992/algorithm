package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/5/15  11:30
 * @link {https://leetcode-cn.com/problems/trapping-rain-water/}
 */
public class 接雨水Test03 {

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

            int[] dpLeftHeight = new int[height.length];
            int[] dpRightHeight = new int[height.length];

            dpLeftHeight[0] = 0;
            dpRightHeight[0] = 0;

            // 左侧最高
            for (int i = 1; i < height.length - 1; i++) {
                dpLeftHeight[i] = Math.max(height[i - 1], dpLeftHeight[i - 1]);
            }
            // 右侧最高
            for (int i = height.length - 2; i > 0; i--) {
                dpRightHeight[i] = Math.max(height[i + 1], dpRightHeight[i + 1]);
                int min = Math.min(dpLeftHeight[i], dpRightHeight[i]);

                if (min > height[i]) {
                    ans += (min - height[i]);
                }
            }

            return ans;
        }
    }


}
