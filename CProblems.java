
import java.util.Scanner;


//         //     System.out.println("Eligible");
//         // }
//         // else{
//         //     System.out.println("Not Eligible");
//         // }
//         boolean result = age >= 60 || isStudent == false ;
//         System.out.print(result ? "Discount Available" : "Discount not available"); 
//     }
// }





// class CProblems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         boolean result = (n%3==0 && n%5==0);
//         System.out.println(result);
//     }
// }



// class CProblems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();
//         boolean result = (n>100 && n<500);
//         System.out.println(result);
//     }
// }



// class CProblems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age : ");
//         int age = sc.nextInt();
//         boolean result = (age>=18);
//         System.out.println(result ? "Eligible" : "Not Eligible");
//     }
// }



// class CProblems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your Mathematics marks : ");
//         int maths = sc.nextInt();
//         System.out.print("Enter your Physics marks : ");
//         int phy = sc.nextInt();
//         System.out.print("Enter your Chemistry marks : ");
//         int chem = sc.nextInt();
//         boolean result = (maths>=60 && phy>=50 && chem>=50);
//         System.out.println(result);
//     }
// }




// class CProblems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter b : ");
//         int b = sc.nextInt();
//         System.out.print("Enter c : ");
//         int c = sc.nextInt();
//         boolean result1 = (a>b && b>c);
//         boolean result2 = (a>b || a>c);
//         boolean result3 = (a==b || b==c);
//         boolean result4 = (a!=b && b!=c);
//         System.out.println(result1);
//         System.out.println(result2);
//         System.out.println(result3);
//         System.out.println(result4);
//     }
// }



// class CProblems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Account Balance : ");
//         int acc = sc.nextInt();
//         System.out.print("Enter Withdrawal Amount : ");
//         int with = sc.nextInt();
//         boolean result = (with<acc);
//         System.out.println(result);
//     }
// }



class CProblems{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        double s = (a+b+c)/2.0d;
        double Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(s);
        System.out.println(Area);
    }
}