package com.datastructuresstackqueue;

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
class StackNew {

    Node top;

    /*
     * To define constructor which save value of top of stack
     */

    public StackNew() {
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
     * To display stack
     */
    public void display() throws Throwable {
        /*
         * To check for stack underflow
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
                if (temp != null) System.out.print(" -> ");
            }
        }
    }
}

/*
 * This is a main class of program
 */
public class DataStrcuture {
    public static void main(String[] args) throws Throwable {

        /*
         * To create stack class object
         */
        StackNew stack1 = new StackNew();

        stack1.push(70);
        stack1.push(30);
        stack1.push(56);

        stack1.display();

    }

}



