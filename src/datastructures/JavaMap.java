package datastructures;

import java.util.*;

public class JavaMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Map<String,Integer> phoneBook = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            String name = scan.nextLine();
            int number = scan.nextInt();
            phoneBook.put(name,number);
        }
//        while (n-->0){
//            System.out.println(n);
//            String name = scan.nextLine();
//            int number = 1;
//
//            phoneBook.put(name,number);
//        }
        System.out.println(phoneBook.toString());

    }
}

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

//    uncle sam=99912222
//    Not found
//    harry=12299933