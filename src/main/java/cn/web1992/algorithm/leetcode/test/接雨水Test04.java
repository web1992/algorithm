package cn.web1992.algorithm.leetcode.test;

/**
 * @author web1992
 * @date 2022/4/23  20:20
 * @link {https://leetcode-cn.com/problems/trapping-rain-water/}
 * @link {https://www.bilibili.com/video/BV1D34y1Y7xp}
 */
public class 接雨水Test04 {

    public static void main(String[] args) {
        // [4,2,0,3,2,5]
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("trap = " + trap(arr));

    }

    // 动态规划
    public static int trap(int[] height) {

        int ans = 0;

        int len = height.length;
        int[] leftH = new int[len];
        int[] rightH = new int[len];

        for (int i = 1; i < len - 1; i++) {
            leftH[i] = Math.max(leftH[i - 1], height[i - 1]);
        }

        for (int i = len - 2; i >= 0; i--) {
            rightH[i] = Math.max(rightH[i + 1], height[i + 1]);
        }

        for (int i = 0; i < len; i++) {
            int min = Math.min(leftH[i], rightH[i]);
            if (min > height[i]) {
                ans += (min - height[i]);
            }
        }

        return ans;
    }

}
