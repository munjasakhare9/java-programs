import java.util.Stack;

class ReverseStack {

    void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insertAtBottom(stack, value);

        stack.push(top);
    }

    void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverse(stack);

        insertAtBottom(stack, top);
    }

    public static void main(String args[]) {

        ReverseStack r = new ReverseStack();

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Before reverse: " + stack);

        r.reverse(stack);

        System.out.println("After reverse: " + stack);
    }
}