package strings;

import java.util.*;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();

        s=s.trim();
        if (s.length()==0){
            System.out.println(0);
            return;
        }

        String[] sList=s.split("[^a-zA-Z]+");
        System.out.println(sList.length);
        for (String sEach:sList ) {
            System.out.println(sEach);
        }
    }
}

/*
Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he
 */