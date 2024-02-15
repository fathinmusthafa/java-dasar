package programmer.zaman.now.collection;

import java.io.PrintStream;
import java.util.EmptyStackException;
import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Fathin");
        stack.push("Musthafa");
        stack.push("Habiburrahman");

        try {
            for (var value = stack.pop(); value != null; value = stack.pop()) {
                System.out.println(value);
            }
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }

    }
}
