
import java.util.Scanner;

class HalfStarCounting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns u need : ");
        int  n = sc.nextInt();
        int col;
        int row;
        for(row=1; row<=n; row++){
            for(col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.print((row));
            System.out.println();
        }
    }
}