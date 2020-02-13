package strings;

import java.util.*;
import java.util.regex.*;

public class DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner scan = new Scanner(System.in);
        int numSentences = Integer.parseInt(scan.nextLine());

        while (numSentences-- > 0) {
            String input = scan.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        scan.close();
    }
}

/*
Sample Input
5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB

Sample Output
Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab
 */