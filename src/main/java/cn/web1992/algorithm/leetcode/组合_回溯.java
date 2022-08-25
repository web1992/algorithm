package cn.web1992.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author web1992
 * @date 2022/5/3  21:19
 * @link {https://leetcode-cn.com/problems/combinations/}
 * @link {https://programmercarl.com/0077.%E7%BB%84%E5%90%88.html#%E5%9B%9E%E6%BA%AF%E6%B3%95%E4%B8%89%E9%83%A8%E6%9B%B2} 回溯
 */
public class 组合_回溯 {

    public static void main(String[] args) {

        // n=4, => 1,2,3,4
        // n = 4, k = 2
        List<List<Integer>> combine = new Solution().combine(4, 2);
        System.out.println(combine.toString());
    }

    // 回溯算法
    static class Solution {

        List<List<Integer>> ans = null;
        LinkedList<Integer> path = null;

        public List<List<Integer>> combine(int n, int k) {
            ans = new ArrayList<>();
            path = new LinkedList<>();

            doCombine(n, k, 1);
            return ans;
        }

        public void doCombine(int n, int k, int startIndex) {
            if (path.size() == k) {
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int i = startIndex; i <= n; i++) {
                path.add(i);
                doCombine(n, k, i + 1);
                path.removeLast();
            }
        }
    }
}