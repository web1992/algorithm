package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/5/15  11:30
 * @link {https://leetcode-cn.com/problems/trapping-rain-water/}
 */
public class 接雨水Test01 {

    public static void main(String[] args) {
        // [4,2,0,3,2,5]
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("trap = " + new Solution().trap(arr));
    }

}

class Solution {

    // 动态规划
    public int trap(int[] height) {

        int len = height.length;
        int[] leftH = new int[len];
        int[] rightH = new int[len];
        // 初始化
        leftH[0] = 0;
        rightH[len - 1] = 0;

        int ans = 0;

        for (int i = 1; i < len; i++) {
            // 当前i位置，左侧最高的柱子的高度
            leftH[i] = Math.max(height[i - 1], leftH[i - 1]);
        }

        for (int i = len - 2; i > 0; i--) {

            // 当前i位置，又侧最高的柱子的高度
            rightH[i] = Math.max(rightH[i + 1], height[i + 1]);

            // 取最的柱子的高度
            int min = Math.min(rightH[i], leftH[i]);
            // 对比高度，计算能接到的雨水
            if (min > height[i]) {
                ans += min - height[i];
            }
        }

        return ans;
    }
}
