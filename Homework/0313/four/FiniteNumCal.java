public class FiniteNumCal{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; sum <= 9876; i++){
            int n = 1;
            for (int j = 1; j <= i;j++){
                n *= j;
            }
            sum+=n;
        }
        System.out.println("res="+sum);
    }
}