
import java.util.Scanner;

class Scholarship{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Academic percantage : ");
        double percentage = sc.nextDouble();
        System.out.print("Enter your family income : ");
        double income = sc.nextDouble();
        boolean result = ((percentage>=85 && income<500000));
        System.out.println(result ? "Student is eligible." : "Student is not eligible.");
    }
}