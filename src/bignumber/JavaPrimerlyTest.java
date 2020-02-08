package bignumber;

import java.math.*;
import java.util.*;

public class JavaPrimerlyTest {
    private static final int CERTAINTY = 100;
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        BigInteger n = scan.nextBigInteger();
        System.out.println(n.isProbablePrime(CERTAINTY) ? "prime" : "not prime");

        scan.close();
    }
}
