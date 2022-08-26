package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @link {https://leetcode.cn/problems/combination-sum-iii/}
 * @link {https://programmercarl.com/0216.%E7%BB%84%E5%90%88%E6%80%BB%E5%92%8CIII.html#%E5%9B%9E%E6%BA%AF%E4%B8%89%E9%83%A8%E6%9B%B2}
 */
public class 组合总和III {

    public static void main(String[] args) {

        // 输入: k = 3, n = 7
        // 输出: [[1,2,4]]

        int k = 3, n = 7;
        List<List<Integer>> lists = new Solution().combinationSum3(k, n);
        for (List<Integer> list : lists) {
            System.out.println(list.toString());
        }
    }

    static class Solution {

        List<List<Integer>> ans = null;
        LinkedList<Integer> path = null;

        /**
         * @param k 几个数
         * @param n sum
         * @return
         */
        public List<List<Integer>> combinationSum3(int k, int n) {

            ans = new ArrayList<>();
            path = new LinkedList<>();

            doCombinationSum3(k, n, 1);
            return ans;
        }

        public void doCombinationSum3(int k, int n, int startIndex) {

            if (n == 0 && k == path.size()) {
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int i = startIndex; i <= 9; i++) {
                path.add(i);
                doCombinationSum3(k, n - i, i + 1);
                path.removeLast();
            }

        }
    }
}
