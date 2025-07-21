package Stack_AND_Queue;

public class ST1_StackUsingArray {

    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public ST1_StackUsingArray(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No top element");
            return -1;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display the stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the stack
    public static void main(String[] args) {
        ST1_StackUsingArray stack = new ST1_StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); // Should show overflow
        stack.display();
    }

}
