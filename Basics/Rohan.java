
import java.util.Scanner;

class Rohan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter km by bus : ");
        float x = sc.nextInt();
        System.out.print("Enter it's avg speed : ");
        float a = sc.nextInt();
        System.out.print("Enter km by auto : ");
        float y = sc.nextInt();
        System.out.print("Enter it's avg speed : ");
        float b = sc.nextInt();
        System.out.print("Enter km he walks : ");
        float z = sc.nextInt();
        System.out.print("Enter it's avg speed : ");
        float c = sc.nextInt();
        float avg_speed = (x+y+z)/((x/a)+(y/b)+(z/c));
        System.out.println("The avg speed he travels is : " + avg_speed);
    }
}