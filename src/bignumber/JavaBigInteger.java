package bignumber;

import java.util.Scanner;
import java.math.BigInteger;

public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);

        BigInteger a=scan.nextBigInteger();
        BigInteger b=scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        scan.close();
    }
}
