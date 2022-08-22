package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/7/4  22:17
 * @link {https://leetcode.cn/problems/unique-binary-search-trees/}
 * @link {https://leetcode.cn/problems/unique-binary-search-trees/solution/shou-hua-tu-jie-san-chong-xie-fa-dp-di-gui-ji-yi-h/}
 * @link {https://programmercarl.com/0096.%E4%B8%8D%E5%90%8C%E7%9A%84%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91.html}
 */
public class 不同的二叉搜索树 {

    public static void main(String[] args) {

        int ans = new Solution().numTrees(3);
        System.out.println(ans);
    }

    static class Solution {

        public int numTrees(int m) {

            int[] dp = new int[m + 1];

            dp[0] = 1;// 空树
            dp[1] = 1;

            for (int i = 2; i <= m; i++) {
                for (int j = 0; j <= i - 1; j++) {
                    dp[i] += dp[j] * dp[i - j - 1];
                }
            }

            return dp[m];
        }
    }
}
