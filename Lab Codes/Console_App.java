
import java.util.Scanner;

class Console_App{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choice;
        do { 
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("_________");
            System.out.println("1. Find Sum of Two numbers");
            System.out.println("2. Find Remainder");
            System.out.println("3. Exit");
            System.out.print("Enter a number (1-3) : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.print("Enter two number : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Sum is : "+ (a+b));
                    break;
                case 2 :
                    System.out.print("Enter two number : ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Remainder is : "+ (x%y));
                    break;
                case 3 :
                    break;
                default:
                    System.out.println("Invalid input . Try again");;
            }
            sc.nextLine();
            sc.nextLine();
        } while (choice!=3);
    }
} 