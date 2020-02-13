package introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
    static int B;
    static int H;
    static boolean b = true;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if (B <= 0 || H <= 0) {
            b = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scan.close();
    }

    public static void main(String[] args) {
        if (b) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

/*
Sample input 1
1
3

Sample output 1
3

Sample input 2
-1
2

Sample output 2
java.lang.Exception: Breadth and height must be positive
 */