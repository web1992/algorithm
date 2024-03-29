package cn.web1992.algorithm.leetcode.动态规划;

/**
 * @author web1992
 * @date 2022/4/23  20:20
 * @link {https://leetcode-cn.com/problems/trapping-rain-water/}
 * @link {https://www.bilibili.com/video/BV1D34y1Y7xp}
 * @link {https://leetcode.cn/problems/trapping-rain-water/solutions/9112/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by-w-8/}
 */
public class 接雨水 {

    public static void main(String[] args) {
        // [4,2,0,3,2,5]
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("trap = " + trap2(arr));

    }

    // 动态规划
    public static int trap(int[] height) {

        int len = height.length;
        int ans = 0;
        int[] leftH = new int[len];
        int[] rightH = new int[len];

        // 初始化
        leftH[0] = 0;
        rightH[len - 1] = 0;

        // 从1开始，最左+最右 不能接雨水
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

    //双指针
    public static int trap2(int[] height) {

        int len = height.length;
        int ans = 0;
        int left = 0;
        int right = len - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        while (left < right) {

            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if (leftMax < rightMax) {
                ans += leftMax - height[left];
                left++;
            } else {
                ans += rightMax - height[right];
                right--;
            }

        }

        return ans;
    }
}
