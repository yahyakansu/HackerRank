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

/*
Sample Input
2

Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
 */