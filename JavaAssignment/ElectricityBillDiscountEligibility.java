
import java.util.Scanner;

class ElectricityBillDiscountEligibility{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units you consumed : ");
        float units = sc.nextFloat();
        System.out.print("Do you have any previous unpaid amount (true/false) : ");
        boolean previous = sc.nextBoolean();
        System.out.println(units<200 && previous == false?"You qualifies the discount":"You didn't qualify the discount");
    }
}