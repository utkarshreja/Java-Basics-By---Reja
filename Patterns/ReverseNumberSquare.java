
import java.util.Scanner;

class ReverseNumberSquare{
    public static void main(String[] args) {
        // for(int row=1; row<=5; row++){
        //     for(int col=5; col>=1; col--){
        //         System.out.print(col+" ");
        //     }
        //     System.out.println();
        // }

        // from user input -----

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns u need : ");
        int  n = sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=n; col>=1; col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}