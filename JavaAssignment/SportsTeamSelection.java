import java.util.Scanner;

class SportsTeamSelection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your fitness score : ");
        float fitness = sc.nextFloat();
        System.out.print("Did you pass the sports trial (true/false) : ");
        boolean trial = sc.nextBoolean();
        System.out.println(age>=16 && age<=21 && fitness>=70 && trial==true?"Selected = true":"Selected = false");
    }
}