package cn.web1992.algorithm.leetcode.二进制;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link {https://leetcode.cn/leetbook/read/top-interview-questions-easy/xncfnv/}
 */
public class 杨辉三角 {

    public static void main(String[] args) {

        List<List<Integer>> generate = new Solution().generate(5);
        for (List<Integer> integers : generate) {
            System.out.println(Arrays.toString(integers.toArray()));
        }
    }


    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();

            if (numRows == 1) {
                ans.add(Arrays.asList(1));
                return ans;
            }
            ans.add(Arrays.asList(1));
            // 第二行
            for (int i = 1; i < numRows; i++) {

                List<Integer> t = new ArrayList<>();

                List<Integer> last = ans.get(ans.size() - 1);
                for (int k = 0; k < i + 1; k++) {
                    int left = k == 0 ? 0 : last.get(k - 1);
                    int right = k == last.size() ? 0 : last.get(k);
                    t.add(left + right);
                }
                ans.add(t);

            }

            return ans;
        }
    }

}
