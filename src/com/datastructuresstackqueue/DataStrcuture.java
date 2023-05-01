package com.datastructuresstackqueue;
/*
 * This is a main class of program
 */

/*
 * Node class for node and data
 */

class Node {

    int data;
    Node link;
}

/*
 * Class to define stack operations method in it
 */
class StackNew2 {

    Node top;

    /*
     * To define constructor which save value of top of stack
     */
    public StackNew2() {
        super();
        this.top = top;
    }

    /*
     * To define push method
     */
    public void push(int x) {

        /*
         * To create node object for new node
         */
        Node temp = new Node();

        /*
         * To check stack fully filled or not
         */
        if (temp == null) {
            System.out.println("Stack Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

    /*
     * To check stack is empty or not
     */
    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        /*
         * check for empty stack
         */
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    /*
     * Utility function to pop top element from the stack
     */
    public void pop() {
        /*
         * To check for stack underflow
         */
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        /*
         * To update the top pointer to point to the next node
         */
        top = (top).link;
    }

    public void display() throws Throwable {
        /*
         * check for stack underflow
         */
        if (top == null) {
            System.out.println("Stack Underflow");
            wait(1);
        } else {
            Node temp = top;
            while (temp != null) {

                /*
                 * print node data
                 */
                System.out.print(temp.data);

                /*
                 * assign temp link to temp
                 */
                temp = temp.link;
                if (temp != null)
                    System.out.print(" -> ");
            }
        }
    }
}
public class DataStrcuture {

    public static void main(String[] args) throws Throwable {

        /*
         * To create stack class object
         */

        StackNew2 stack2 = new StackNew2();

        stack2.push(70);
        stack2.push(30);
        stack2.push(56);

        System.out.println(stack2.peek());
        stack2.pop();
        System.out.println(stack2.peek());
        stack2.pop();
        System.out.println(stack2.peek());
        stack2.pop();
        System.out.println(stack2.peek());

    }
}





