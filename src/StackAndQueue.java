import java.io.IOException;

public class StackAndQueue {
    private String input;
    private String output;
    public StackAndQueue(String in) {
        input = in;
    }
    public String doRev() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            output = output + ch;
        }
        return output;
    }
    public String doPrint() {
        Queue queue = new Queue(input.length());

        for (int i = 0; i < input.length(); i++) {
            queue.enqueue(input.charAt(i));
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            out.append(queue.dequeue());
        }
        output = out.toString();
        return output;
    }
    public static void main(String[] args)
            throws IOException {
        String input = "Java Source and Support";
        String output;
        StackAndQueue stackAndQueue =
                new StackAndQueue(input);
        output = stackAndQueue.doRev();
        System.out.println("Reversed: " + output);
        output = stackAndQueue.doPrint();
        System.out.println("Print: " + output);
    }
    class Stack {
        private int maxSize;
        private char[] stackArray;
        private int top;
        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }
        public void push(char j) {
            stackArray[++top] = j;
        }
        public char pop() {
            return stackArray[top--];
        }
        public char peek() {
            return stackArray[top];
        }
        public boolean isEmpty() {
            return (top == -1);
        }
    }
    class Queue {
        private char[] queueArray;
        private int maxSize;
        private int head;
        private int tail;

        public Queue(int max) {
            maxSize = max;
            queueArray = new char[max];
            head = -1;
            tail = -1;
        }

        public void enqueue(char j) {
            if (head == -1) {
                head = 0;
            }
            queueArray[++tail] = j;
        }

        public char dequeue() {
            return queueArray[head++];
        }

        public char peek() {
            return queueArray[head];
        }
    }
}