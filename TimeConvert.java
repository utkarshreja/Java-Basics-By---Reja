
import java.util.Scanner;

class TimeConvert{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int s;
        s = obj.nextInt();
        int H = s/3600;
        int rs = s%3600;
        int M = rs/60;
        int S = rs%60;
        System.out.print(H + ":" + M + ":" + S);
    }
}