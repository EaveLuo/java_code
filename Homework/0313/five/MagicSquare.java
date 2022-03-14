public class MagicSquare{
public static void main(String[] args) {
        // n为阶数
        int n = 5, vessel[][] = new int[n][n];
        int fr = 0,fc = n/2;
        for(int i = 1; i <= n*n; i++){
            vessel[fr][fc] = i;
            if(i % n == 0){
                fr = (fr+1)%n;
            }
            else{
                fr = (fr-1+n)%n;
                fc = (fc+1)%n;
            }
        }
        // output
        System.out.println("——————————"+n+"阶幻方如下"+"——————————");
            for (int i = 0; i < vessel.length; i++){
                for (int j = 0; j < vessel[i].length; j++){
                    System.out.print(vessel[i][j]+"\t");
                }
                System.out.println();
            }
    }
}