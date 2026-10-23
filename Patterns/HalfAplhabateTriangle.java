
import java.util.Scanner;

class HalfAplhabateTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int x = 65;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print((char)(row+64)+" ");
            // x+=1;
            }
            System.out.println();
        }
    }
}