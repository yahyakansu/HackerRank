package introduction;

import java.util.Scanner;

public class Loop1 {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scan.close();

        for(int i=1;i<=10;i++){
            System.out.println(N +" x "+i+" = "+N*i);
        }

    }
}
