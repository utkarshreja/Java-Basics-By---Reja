
import java.util.Scanner;

class TiltedParallalogram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // upper half
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // lower half
        for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(c==r || c>r)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}