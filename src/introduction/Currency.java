package introduction;

import java.text.*;
import java.util.*;

public class Currency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();

        // Write your code here.
        String us= NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india= NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
