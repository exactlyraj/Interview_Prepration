import java.util.Stack;

public class JVM {
    public static void main(String[] args) {
        // Example bytecode: push 5, push 3, add, print
        int[] bytecode = {1, 5, 1, 3, 2, 3};
        // 1=push, 2=add, 3=print

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < bytecode.length; i++) {
            switch (bytecode[i]) {
                case 1: // push
                    stack.push(bytecode[++i]);
                    break;
                case 2: // add
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a + b);
                    break;
                case 3: // print
                    System.out.println(stack.pop());
                    break;
            }
        }
    }
}
