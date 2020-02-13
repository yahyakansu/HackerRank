package datastructures;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        LinkedList<Integer> list = new LinkedList();

        while (N-->0){
            list.add(scan.nextInt());
        }

        int Q=scan.nextInt();
        while (Q-->0){
            String action =scan.next();
            if(action.equals("Insert")){
                int index=scan.nextInt();
                int value=scan.nextInt();
                list.add(index,value);
            }else if(action.equals("Delete")){
                list.remove(scan.nextInt());
            }
        }

        for (Integer i:list) {
            System.out.print(i+" ");
        }
    }
}
