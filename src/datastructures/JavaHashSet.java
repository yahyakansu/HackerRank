package datastructures;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scan.next();
            pair_right[i] = scan.next();
        }
        scan.close();

//Write your code here

        HashSet<String> set = new HashSet<>();
        for (int i=0;i<t;i++){
            set.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(set.size());
        }
    }
}

/*
Sample Input
5
john tom
john mary
john tom
mary anna
mary anna

Sample Output
1
2
2
3
3
 */