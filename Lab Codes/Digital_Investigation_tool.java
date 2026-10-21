
import java.util.Scanner;

class Digital_Investigation_tool{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int choice;
        do { 

            System.out.println("------ Digital Investigation Tool ------");
            System.out.println("~~ Choose your Investigation type ~~");
            System.out.println("1. Find the first digit");
            System.out.println("2. Find the last digit");
            System.out.println("3. Count occurances of a given digit");
            System.out.println("4. Find the largest digit");
            System.out.println("5. Find the smallest digit");
            System.out.println("6. Calculate the sum of even digit");
            System.out.println("7. Exit");
            System.out.print("Choose an operation of ur choise : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.print("Enter a number : ");
                    int a = sc.nextInt();
                    // int z = 0;
                        while(a>=10){
                        // z = a%10;
                        a = a/10;
                        } 
                    System.out.println("First digit is : "+ a);
                    break;

                case 2 :
                    System.out.print("Enter a number : ");
                    int b = sc.nextInt();
                    System.out.println("Last digit is : "+ (b%10));
                    break;
                case 3 :
                    System.out.println("Enter a number : ");
                    int c = sc.nextInt();
                    System.out.println("Enter the number you want to count : ");
                    int d = sc.nextInt();
                    int count =0 ;
                        while(c>0){
                            int y = c%10;
                            if (y==d){
                                count++;
                            }
                            c/=10;
                        }
                    System.out.println("Occurrence is : "+ count);
                    break;
                case 4 : 
                    System.out.println("Enter a number : ");
                    int e = sc.nextInt();
                    int max = Integer.MIN_VALUE;
                    while(e>0){
                        int x = e%10;
                        if (x>max) {
                            max = x ;
                        }
                    e/=10;
                    }
                    System.out.println("Largest digit of the given number is : "+max);
                    break;
                case 5 : 
                    System.out.println("Enter a number : ");
                    int f = sc.nextInt();
                    int min = Integer.MAX_VALUE;
                    while(f>0){
                        int w = f%10;
                        if (w<min) {
                            min = w ;
                        }
                    f/=10;
                    }
                    System.out.println("Smallest digit of the given number is : "+min);
                    break;
                case 6 : 
                    System.out.println("Enter a number : ");
                    int g = sc.nextInt();
                    int sum = 0;
                    while(g>0){
                    int v = g%10;
                    if (v%2==0){
                        sum += v;
                    } 
                    g/=10;
                    }
                    System.out.println("The sum of even digit's of the given number is : "+sum);
                case 7 :
                    break;
                default:
                    System.out.println("Invalid input . Try again");;
            }
            sc.nextLine();
            sc.nextLine();
        } while (choice!=7);
    }
} 