package introduction;

import java.util.Scanner;

public class Loop2 {
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum =a;
            for(int j=0;j<n;j++){
                int result = (int)Math.pow(2,j);
//                System.out.print(result+" ");
                sum = sum+result*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/*
Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
 */