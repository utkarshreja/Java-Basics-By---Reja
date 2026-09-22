
import java.util.Scanner;

class CW{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String check = (a>b) ? "a is maximum" : "b is maximum";
        System.out.println(check);
    }
}