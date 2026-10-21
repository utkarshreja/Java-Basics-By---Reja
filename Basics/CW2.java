
import java.util.Scanner;

class CW2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        String check = (a>=0) ? "Positive" : "Negative";
        System.out.println(check);
    }
}