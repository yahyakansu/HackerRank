package datastructures;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();

            deque.add(num);
            set.add(num);

            if (deque.size()==m){
                if (set.size()>max){
                    max = set.size();
                }

                int first = (int) deque.remove();
                if (!deque.contains(first)){
                    set.add(first);
                }
            }
        }
        System.out.println(max);
    }
}

/*
Sample Input
6 3
5 3 5 2 3 2

Sample Output
3
 */