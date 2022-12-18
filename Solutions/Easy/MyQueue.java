package Easy;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
        public MyQueue() {
        }

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            if (stack2.isEmpty())
                while(!stack1.isEmpty())
                    stack2.push(stack1.pop());
            return stack2.pop();

        }

        public int peek() {
            if (stack2.isEmpty())
                while(!stack1.isEmpty())
                    stack2.push(stack1.pop());
            return stack2.peek();
        }

        public boolean empty() {
            return stack1.empty() && stack2.empty();

    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(5);
        var res = myQueue.peek();
        System.out.println(res);
        res = myQueue.pop();
        System.out.println(res);
        System.out.println(myQueue.empty());
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
