import java.util.Scanner;

class BMICalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kg : ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in metres : ");
        double height = sc.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("BMI is : " + bmi);
    }
}