package cn.web1992.algorithm.leetcode;

/**
 * @author web1992
 * @date 2022/6/5  13:18
 * @link {https://www.ruanyifeng.com/blog/2021/01/_xor.html}
 *
 * <pre>
 *     一个数组包含 n+1 个成员，这些成员是 1 到 n 之间的整数。只有一个成员出现了两次，其他成员都只出现一次，请找出重复出现的那个数字。
 * </pre>
 */
public class XOR {

    // XOR 相同为0
    //     不同为1
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 7};
        System.out.println(test(arr));

        System.out.println(test(new int[]{1, 2, 3, 4, 5, 6, 7, 1}));
        System.out.println(test(new int[]{1, 2, 3, 4, 5, 6, 7, 5}));

    }

    public static int test(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            //ans = ans ^ arr[i];
            ans ^= arr[i];
        }
        return ans;
    }
}
