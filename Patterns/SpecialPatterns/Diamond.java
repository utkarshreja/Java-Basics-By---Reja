
import java.util.Scanner;

class Diamond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // upper half
        for(int i=1; i<n; i++){
            // space
            for(int spaces=n-i; spaces>0; spaces--){
                System.out.print("  ");
            }
            // stars
            for(int stars=1; stars<=2*i-1; stars++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        // lower half
        for(int i=n; i>0; i--){
            // space
            for(int spaces=n-i; spaces>0; spaces--){
                System.out.print("  ");
            }
            // stars
            for(int stars=1; stars<=2*i-1; stars++){
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}