
import java.util.Scanner;

class Pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns u need : ");
        int  n = sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}