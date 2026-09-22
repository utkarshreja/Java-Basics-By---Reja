
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Choose your operation : ");
        String op = sc.next();
        switch(op){
            case "add" -> System.out.println(a+b);
            case "sub" -> System.out.println(a-b);
            case "multi" -> System.out.println(a*b);
            case "div" -> System.out.println(a/b);
            case "modulo" -> System.out.println(a%b);
            default -> System.out.println("Invalid Operation");
        }
    }
}