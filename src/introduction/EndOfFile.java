package introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n=1;
        while (scan.hasNext()){
            System.out.println(n+" "+scan.nextLine());
            n++;
        }
        scan.close();
    }
}

/*
Sample Input
Hello world
I am a file
Read me until end-of-file.

Sample Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
 */