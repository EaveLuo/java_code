/**
 * @author Eave Luo
 */
public class ArrayApp {
    static int[][] arr = { { 1, 4, 5 }, { 16, 28, 59, 6, 7, 8 }, { 1, 2, 5, 94 } };

    public static void main(String[] args) {
        System.out.println("该数组共有" + arr.length + "行");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "行有" + arr[i].length + "个元素");
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("数组中所有元素之和等于" + sum);
    }
}
