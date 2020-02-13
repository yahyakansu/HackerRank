package datastructures;

import java.util.*;

public class JavaArrayLIst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //save numbers
        List<List<Integer>> listOut = new ArrayList<>();
        for (int i=0;i<n;i++){
            int count = scan.nextInt();
            List<Integer> listIn=new ArrayList<>();
            for (int j=0;j<count;j++){
                listIn.add(scan.nextInt());
            }
            listOut.add(listIn);
        }

        //check
        int m = scan.nextInt();
        for (int i=0 ; i<m ; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            List<Integer> list = listOut.get(x-1);

            if (y <= list.size()) {
                System.out.println(list.get(y-1));
            } else {
                System.out.println("ERROR!");
            }

        }
        scan.close();
    }
}

/*
Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output
74
52
37
ERROR!
ERROR!
 */