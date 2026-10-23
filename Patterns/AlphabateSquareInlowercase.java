
import java.util.Scanner;

class AlphabateSquareInlowercase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int x = 97;  for uppercase take x = 65
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print((char)(col+96)+" ");
            }
            // x+=1;
            System.out.println();
        }
    }
}