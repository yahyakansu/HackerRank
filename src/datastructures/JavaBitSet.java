package datastructures;

import java.util.*;

public class JavaBitSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        while (M-- > 0) {
            String str = scan.next();
            int a = scan.nextInt();
            int b = scan.nextInt();
            switch (str) {
                case "AND":
                    if (a == 1) B1.and(B2);
                    else B2.and(B1);
                    break;
                case "OR":
                    if (a == 1) B1.or(B2);
                    else B2.or(B1);
                    break;
                case "XOR":
                    if (a == 1) B1.xor(B2);
                    else B2.xor(B1);
                    break;
                case "FLIP":
                    if (a == 1) B1.flip(b);
                    else B2.flip(b);
                    break;
                case "SET":
                    if (a == 1) B1.set(b);
                    else B2.set(b);
                    break;
                default:
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
        scan.close();
    }
}

/*
Sample Input
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

Sample Output
0 0
1 0
1 1
1 2
 */
