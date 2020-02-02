package strings;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String A=scan.next();
        /* Enter your code here. Print output to STDOUT. */

        String s="";
        for (int i=A.length()-1;i>=0;i--){
            s=s+A.charAt(i);
        }
        if (A.equals(s)){
            System.out.println("Yes");
        }else System.out.println("No");

    }
}
