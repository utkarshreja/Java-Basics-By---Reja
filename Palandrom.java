
import java.util.Scanner;

class Palandrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int n;
        int t =sc.nextInt();
        n = t ;
        for(i=0; n>0; n/=10){
            i = (i*10) + (n%10);
        }
        if(i==t)
            System.out.println("true");
        else
            System.out.println("false");
    }
}