package objectorientedprogramming;

import java.util.*;

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {System.out.println("1."+i);
            if (n % i == 0) {
                sum += i;

                if (i * i != n) {
                    sum += n / i;
                }
                System.out.println("2."+i);
            }
        }
        return sum;
    }
}

public class JavaInterface {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

/*
Sample Input
6

Sample Output
I implemented: AdvancedArithmetic
12
 */