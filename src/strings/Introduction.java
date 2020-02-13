package strings;

import java.util.*;

public class Introduction {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String A=scan.next();
        String B=scan.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        scan.close();
    }
}

/*
Sample Input 0
hello
java

Sample Output 0
9
No
Hello Java
 */