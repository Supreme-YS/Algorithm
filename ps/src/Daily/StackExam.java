package Daily;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(7);

        while (!stack.empty()) {
            System.out.println(stack.peek() + " ");
            stack.pop();
        }
    }
}
