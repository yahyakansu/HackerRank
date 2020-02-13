package strings;

import java.util.*;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toUpperCase();
        b=b.toUpperCase();
        boolean reverse = false;
        StringBuilder sb= new StringBuilder(b);

        if(a.length()==b.length()){
            for(int i=0; i<a.length();i++){
                for(int j=0; j<sb.length();j++){
                    if(a.charAt(i)==sb.charAt(j)){
                        sb.deleteCharAt(j);
                        if(i==a.length()-1 && sb.length()==0){
                            reverse=true;
                            break;
                        }
                        break;

                    }
                }
            }
        }return reverse;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean reverse = isAnagram(a, b);
        System.out.println( (reverse) ? "Anagrams" : "Not Anagrams" );
    }
}

/*
Sample Input 0
anagram
margana

Sample Output 0
Anagrams
 */