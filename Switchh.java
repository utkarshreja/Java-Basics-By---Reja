
import java.util.Scanner;

class Switchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int button = sc.nextInt();
        // if (button==1){
        //     System.out.println("Hello");
        // }
        // else if(button==2){
        //     System.out.println("Namaste");
        // }
        // else if(button==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid");
        // }
        switch (button){
            case 1 -> System.out.println("Hello");
            case 2 -> System.out.println("Namaste");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid Button"); 
        }
    }
}