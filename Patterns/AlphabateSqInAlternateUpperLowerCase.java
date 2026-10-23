import java.util.Scanner;

class AlphabateSqInAlternateUpperLowerCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row%2!=0)
                    System.out.print((char)(row+96)+" ");
                else
                    System.out.print((char)(row+64)+" ");
            }
            System.out.println();
        }
    }
}