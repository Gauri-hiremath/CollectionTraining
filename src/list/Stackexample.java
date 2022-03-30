package list;

import java.util.Iterator;
import java.util.Stack;

public class Stackexample {
    public static void main(String args[]) {

        Stack<String> stack = new Stack<String>();
        stack.push("Gauri");
        stack.push("Sadashiv");
        stack.push("Hiremath");
        stack.push("Sangli");

        Iterator <String> itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        stack.pop();

        itr = stack.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
