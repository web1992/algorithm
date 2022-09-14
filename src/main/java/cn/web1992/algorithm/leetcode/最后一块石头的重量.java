package cn.web1992.algorithm.leetcode;

import java.util.PriorityQueue;

/**
 * @link {https://leetcode-cn.com/problems/last-stone-weight/}
 */
public class 最后一块石头的重量 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 7, 4, 1, 8, 1};
        int ans = new Solution().lastStoneWeight(arr);
        System.out.println(ans);
    }

    static class Solution {


        public int lastStoneWeight(int[] stones) {

            PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

            for (int stone : stones) {
                queue.offer(stone);
            }

            while (queue.size() > 1) {
                Integer a = queue.poll();
                Integer b = queue.poll();
                if (a > b) {
                    queue.offer(a - b);
                }
            }
            if (queue.isEmpty()) {
                return 0;
            }
            return queue.poll();
        }

    }

}