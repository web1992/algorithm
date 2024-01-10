package cn.web1992.algorithm.arrays;

public class ArraysTest {

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }

        // 打印数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 换行
        }
    }
}
