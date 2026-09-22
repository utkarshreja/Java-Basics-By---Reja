
import java.util.Scanner;


//         int calculate = (a * b)/(a - b);
//         System.out.println(calculate);
//     }
// }



// class Problems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter the value of b : ");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.print("The sum of a and b is : ");
//         System.out.println(sum);
//     }
// }


// class Problems {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a : ");
//         int a = sc.nextInt();
//         System.out.print("Enter b : ");
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("Equal");
//         } else if (a>b)
//                 System.out.println("a is greater");
//         else{
//                 System.out.println("a is lesser");
//         }
//     }
// }


// class Problems{
//     public static void main(String[] args) {
//         for (; ;) {
//             System.out.println("Apna College");
//         }
//     }
// }


// class Problems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int n = sc.nextInt();
//         for (int i = 2 ;  i <= n ; i = i + 2){
//             System.out.println(i);
//         }
//     }
// }


// class Problems{
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++){
//             for(int j = 1; j <=5; j++){
//                 System.out.print("*");
//             }
//         System.out.println("");
//         }
//     }
// }


// class Problems{
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
        
//         // outer loop
//         for(int i=1; i<=n; i++){
//             // inner loop
//             for(int j=1; j<=m; j++){
//                 // cell -> (i, j)
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// class Problems{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int l = sc.nextInt();
//         int b = sc.nextInt();
//         int area = l * b;
//         int peri = 2 * (l + b);
//         System.out.println("The area of rectangle is : " + area);
//         System.out.print("The perimeter of rectangle is : " + peri);
//     }
// }


class Problems{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sub1 = sc.nextInt();
        int Sub2 = sc.nextInt();
        int Sub3 = sc.nextInt();
        int Total = Sub1 + Sub2 + Sub3;
        float Avg = (Sub1 + Sub2 + Sub3)/3.0f;
        System.out.println("Your total marks are : " + Total);
        System.out.print("Your average marks are : " + Avg);
    }
}