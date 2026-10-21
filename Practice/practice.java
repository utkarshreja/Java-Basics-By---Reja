
import java.util.Scanner;
class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            count = count + (n&1);
            n = n>>1;
        }
        System.out.print(count);
    }
}
// count the numbers of 1 in a number afetr it is converted into binary from decimal.
