package cn.web1992.algorithm.leetcode.回溯算法;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @link {https://leetcode.cn/problems/combination-sum/}
 * @link {https://programmercarl.com/0039.%E7%BB%84%E5%90%88%E6%80%BB%E5%92%8C.html}
 */
public class 组合总和 {

    /**
     * 输入：candidates = [2,3,6,7], target = 7
     * 输出：[[2,2,3],[7]]
     * 解释：
     * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
     * 7 也是一个候选， 7 = 7 。
     * 仅有这两种组合。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combination-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * `
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = new Solution().combinationSum(arr, target);

        for (List<Integer> an : ans) {
            System.out.println(an);
        }

    }


    static class Solution {

        // 满足条件的组合
        List<List<Integer>> ans = new ArrayList<>();
        // 可能的组合
        Deque<Integer> path = new LinkedList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {

            getNums(candidates, target, 0, 0);
            return ans;
        }


        public void getNums(int[] arr, int target, int sum, int startIndex) {

            if (sum > target) {
                return;
            }

            if (sum == target) {
                ans.add(new ArrayList<>(path));
                return;
            }

            for (int i = startIndex; i < arr.length; i++) {
                path.add(arr[i]);
                getNums(arr, target, arr[i] + sum, i);
                //System.out.println("path=" + path);
                path.removeLast();
            }

        }
    }

}
