
import java.util.Scanner;

class CW4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your distance : ");
        int dis = sc.nextInt();
        int fare;
        if (dis<=5){
            System.out.println("Your total fare is : " + 50 );
        }
        else if (dis >= 5 && dis <= 15){
            dis = dis - 5;
            fare = 50 + (dis*10);
            System.out.println("Your total fare is : " + fare );
        }
        else if (dis >= 15 && dis <= 30){
            dis = dis - 15;
            fare = 150 + (dis*12);
            System.out.println("Your total fare is : " + fare );
        }
        else{
            dis = dis - 30;
            fare = 330 + (dis*15);
            System.out.println("Your total fare is : " + fare );
        }
    }
}