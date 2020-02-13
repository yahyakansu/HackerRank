package datastructures;

import java.util.*;

public class JavaMap {
    public static void main(String[] arg) {
        Map<String, Integer> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        /*add key and value to the map*/
        while (n-- > 0) {
            String name = scan.nextLine();
            int number = scan.nextInt();
            scan.nextLine();
            phoneBook.put(name, number);
        }

        /*compare the added values*/
        while (scan.hasNext()){
            String s = scan.nextLine();
            if (phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }else {
                System.out.println("Not found");
            }
        }
    }
}

// input
//        3
//        uncle sam
//        99912222
//        tom
//        11122222
//        harry
//        12299933
//        uncle sam
//        uncle tom
//        harry

// output
//    uncle sam=99912222
//    Not found
//    harry=12299933