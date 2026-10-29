
import java.util.Scanner;

class EquilateralTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            // space
            for(int spaces=n-i; spaces>0; spaces--){
                System.out.print(" ");
            }
            // stars
            for(int stars=1; stars<=2*i-1; stars++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}