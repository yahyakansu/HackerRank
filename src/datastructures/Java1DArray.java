package datastructures;

import sun.jvm.hotspot.memory.PlaceholderEntry;

import java.util.*;

public class Java1DArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Integer [] a = new Integer[n];
        for (int i=0;i< a.length;i++){
            a[i]= scan.nextInt();
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

/*
Sample Input
5
10
20
30
40
50

Sample Output
10
20
30
40
50
 */