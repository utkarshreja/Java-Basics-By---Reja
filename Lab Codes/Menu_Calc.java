
import java.util.Scanner;

class Menu_Calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char choice;
        do { 
            System.out.println("------ Find solution of your problems (not life problems) ------");
            System.out.println("~~ Choose an operation ~~");
            System.out.println("Addition (+)");
            System.out.println("Subtraction (-)");
            System.out.println("Multiplication (*)");
            System.out.println("Division (/)");
            System.out.println("Remainder (%)");
            System.out.println("For Exit -> 0");
            System.out.print("Enter your choosen operation : ");
            choice = sc.next().charAt(0);
            switch (choice) {
                case '+' :
                    System.out.print("Enter two number : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum is : "+ (a+b));
                    break;
                case '-' :
                    System.out.print("Enter two number : ");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("Remainder is : "+ (c-d));
                    break;
                case '*' :
                    System.out.print("Enter two number : ");
                    int e = sc.nextInt();
                    int f = sc.nextInt();
                    System.out.println("Remainder is : "+ (e*f));
                    break;
                case '/' :
                    System.out.print("Enter two number : ");
                    int g = sc.nextInt();
                    int h = sc.nextInt();
                    System.out.println("Remainder is : "+ (g/h));
                    break;
                case '%' :
                    System.out.print("Enter two number : ");
                    int i = sc.nextInt();
                    int j = sc.nextInt();
                    System.out.println("Remainder is : "+ (i%j));
                    break;
                case '0' :
                    break;
                default:
                    System.out.println("Invalid input . Try again");;
            }
            sc.nextLine();
            sc.nextLine();
        } while (choice!=0);
    }
} 