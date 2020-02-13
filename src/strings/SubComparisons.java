package strings;

import java.util.*;

public class SubComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        smallest=s.substring(0,k);
        String s1;
        for (int i=1;i<=s.length()-k;i++){
            s1=s.substring(i,i+k);
            if (smallest.compareTo(s1)>0){
                smallest=s1;
            }
        }

        largest=s.substring(0,k);
        String s2;
        for (int i=1;i<=s.length()-k;i++){
            s2=s.substring(i,i+k);
            if (largest.compareTo(s2)<0){
                largest=s2;
            }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}


/*
Sample Input 0
welcometojava
3

Sample Output 0
ava
wel
 */