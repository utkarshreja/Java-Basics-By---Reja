
import java.util.Scanner;

class TwoHalfTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // upper half
        for(int i = 1; i<n; i++){
        for(int spaces=n-i; spaces>0; spaces--){
                System.out.print(" ");
            }
            for(int stars=i; stars>0; stars--){
                System.out.print("*");         
            }
            System.out.println("");
        }

        // lower half
        for(int i = 1; i<=n; i++){
        for(int spaces=i-1; spaces>0; spaces--){
                System.out.print(" ");
            }   
            for(int stars=n-i+1; stars>0; stars--){
                System.out.print("*");         
            }
            System.out.println("");
        }
    }
}

