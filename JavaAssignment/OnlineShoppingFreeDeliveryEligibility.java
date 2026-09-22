import java.util.Scanner;

class OnlineShoppingFreeDeliveryEligibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order amount : ");
        double amount = sc.nextDouble();
        System.out.print("Are you a registered user (true/false) : ");
        boolean registered = sc.nextBoolean();
        System.out.println(amount>=1000 && registered==true?"You qualify for free delivery":"You did not qualify for free delivery");
    }
}