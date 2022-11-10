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

            // 5,6,3,2,1 k=2
            int len = nums.length;
            int heapLen = nums.length;
            buildHeap(nums, len);
            int parentIndex = 0;
            for (int i = heapLen - 1; i >= len - k + 1; i--) {
                swap(nums, i, parentIndex);// 把最大的元素移动到数组的最后
                heapfiy(nums, --heapLen, parentIndex);// 缩小堆的大小+进行堆化处理
            }

            return nums[0];
        }

        public void buildHeap(int[] nums, int len) {

            int lastNode = len - 1;
            int parentIndex = (lastNode - 1) / 2;

            for (int i = parentIndex; i >= 0; i--) {
                heapfiy(nums, len, i);
            }

        }

        /**
         * <pre>
         *             10
         *           /   \
         *          5     6
         *        /   \   /
         *       4    3  2
         * </pre>
         *
         * @param nums
         * @param parentIndex
         */
        public void heapfiy(int[] nums, int len, int parentIndex) {
            int max = parentIndex;
            int child1 = 2 * parentIndex + 1;
            int child2 = 2 * parentIndex + 2;

            if (child1 < len && nums[max] < nums[child1]) {
                max = child1;
            }

            if (child2 < len && nums[max] < nums[child2]) {
                max = child2;
            }
            if (parentIndex != max) {
                swap(nums, parentIndex, max);
                heapfiy(nums, len, max);
            }
        }

        private void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

}
