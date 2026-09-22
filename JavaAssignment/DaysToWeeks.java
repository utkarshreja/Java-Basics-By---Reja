
import java.util.Scanner;

class DaysToWeeks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of days : ");
        int days = sc.nextInt();
        int weeks = days/7;
        int remainingDays = days%7;
        System.out.println("Complete Weeks = " + weeks);
        System.out.println("Remaining Days = " + remainingDays);
    }
}