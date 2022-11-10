package cn.web1992.algorithm.leetcode.堆栈;


/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions/xal9h6/}
 * @link {https://leetcode.cn/problems/kth-largest-element-in-an-array/solutions/307351/shu-zu-zhong-de-di-kge-zui-da-yuan-su-by-leetcode-/} 题解
 */
public class 数组中的第K个最大元素_堆 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 5, 6, 4};

        int ans = new Solution().findKthLargest(arr, 2);
        System.out.println(ans);
    }

    static class Solution {

        public int findKthLargest(int[] nums, int k) {

            return k;
        }


        private void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

}
