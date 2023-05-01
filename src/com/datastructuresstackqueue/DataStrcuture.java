package com.datastructuresstackqueue;

/*
 * Node class for node and data
 */

class Node {

    int data;
    Node next;
}

/*
 * Class to define stack operations method in it
 */

public class DataStrcuture {
    /*
     * Node class for node and data
     */
    static class Node {
        int data;
        Node nextnode;

        /*
         * To define constructor for data and node
         */
        public Node(int data) {
            super();
            this.data = data;
            this.nextnode = null;
        }
    }

    /*
     * Class to define queue operation method
     */
    static class QueueNew {
        Node front, rear;

        /*
         * Constructor for rear and front of queue
         */

        public QueueNew() {
            super();
            this.front = null;
            this.rear = null;
        }

        /*
         * To insert data in queue
         */

        void toEnqueue(int data) {

            Node temp = new Node(data);


            /*
             * To check queue is empty or not
             */

            if (rear == null) {
                front = rear = temp;
                return;
            }
            rear.nextnode = temp;
            rear = temp;
        }
    }

    /*
     * This is main class of program
     */

    public static void main(String[] args) throws Throwable {

        /*
         * To create stack class object
         */

        QueueNew obj = new QueueNew();

        obj.toEnqueue(56);
        obj.toEnqueue(30);
        obj.toEnqueue(70);

        System.out.println("Queue Front : " + ((obj.front != null) ? (obj.front).data : -1));
    }
}








