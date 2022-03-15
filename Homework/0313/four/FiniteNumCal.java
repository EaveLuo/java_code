public class FiniteNumCal {
    public static void main(String[] args) {
        int sum = 0;
        int n = 1;
        while (sum <= 9876) {
            n++;
            int i = 1;
            for (int j = 1; j <= n; j++) {
                i *= j;
            }
            sum += i;
        }
        System.out.println("res=" + (n - 1));
    }
}