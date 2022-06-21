package cn.web1992.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author web1992
 * @date 2022/6/20  09:24
 * @link {https://leetcode.cn/problems/k-diff-pairs-in-an-array/}
 * @link {https://www.bilibili.com/video/BV1sT411G7eu}
 */
public class 数组中的k_diff数对 {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 1, 4, 1, 5};
        int k = 2;
        int ans = new Solution().findPairs(arr, k);
        System.out.println("ans=" + ans);
    }

    static class Solution {

        public int findPairs(int[] nums, int k) {

            Set<Integer> searched = new HashSet<>();
            Set<Integer> ans = new HashSet<>();

            // |num-x| == k
            // 1. num-k=x
            // 2. x-num=k -> x=num+k
            for (int num : nums) {

                // 因为是数对，如果只取最大/最小值 即可统计所有的数对了
                // 最大值/最小值，如果存在重复set可去重
                if (searched.contains(num - k)) {// 取最小/取最大
                    ans.add(num - k);
                }

                if (searched.contains(num + k)) {// 取最小/取最大
                    ans.add(num);
                }

                searched.add(num);
            }

            return ans.size();
        }
    }
}
