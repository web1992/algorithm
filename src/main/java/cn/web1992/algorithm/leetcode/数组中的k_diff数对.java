package cn.web1992.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author web1992
 * @date 2022/6/20  09:24
 * @link {https://leetcode.cn/problems/k-diff-pairs-in-an-array/}
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

            for (int num : nums) {

                if (searched.contains(num - k)) {
                    ans.add(num - k);
                }

                if (searched.contains(num + k)) {
                    ans.add(num);
                }

                searched.add(num);
            }

            return ans.size();
        }
    }
}
