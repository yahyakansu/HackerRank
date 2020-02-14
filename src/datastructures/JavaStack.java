package datastructures;

import java.util.*;

public class JavaStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            System.out.println(isBalanced(scan.next()));
        }
        scan.close();
    }

    static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
                        || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}

/*
Sample Input
{}()
({()})
{}(
[]

Sample Output
true
true
false
true
 */