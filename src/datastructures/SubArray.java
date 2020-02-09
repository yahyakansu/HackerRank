package datastructures;

import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] arr = new int[length];

        int a = scan.nextInt();
        arr[0] = a;
        int count = a < 0 ? 1 : 0;

        for (int i = 1; i < length; i++){
            int num = scan.nextInt();
            arr[i] = arr[i - 1] + num;

            if (arr[i] < 0){
                count++;
            }

            for (int j = 0; j < i; j++){
                int sub_result = arr[i] - arr[j];
                if (sub_result < 0){
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
