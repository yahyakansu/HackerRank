package strings;

import java.util.*;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases>0){
            String pattern = scan.nextLine();
            //Write your code
            try{
                Pattern p=Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){System.out.println("Invalid");}
            testCases--;
        }
        scan.close();
    }
}

/*
Sample Input
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output
Valid
Invalid
Invalid
 */