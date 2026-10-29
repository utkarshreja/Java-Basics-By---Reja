
import java.util.Scanner;

class AlphaNumericTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                if(r%2!=0)
                    System.out.print(c);
                else
                    System.out.print((char)(c+64));
            }
            System.out.println("");
        }
    }
}