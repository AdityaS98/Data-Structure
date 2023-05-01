package com.datastructuresstackqueue;

/*
 * Node class for node and data
 */

class Node {

    int data;
    Node next;

    public Node(int data) {
        super();
        this.data = data;
        this.next = null;
    }
}

/*
 * Class to define queue operation method
 */
class QueueNew2 {
    Node front, rear;

    /*
     * Constructor for rear and front of queue
     */
    public QueueNew2() {
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
        rear.next = temp;
        rear = temp;
    }

    void toDequeue() {
        if (front == null)
            return;

        Node temp = front;
        front = front.next;

        if (front == null)
            rear = null;
    }



    /*
     * This is main method  of program
     *
     */

    public class DataStructure {
        /*
         * This is the main class of our program
         */

        public static void main(String[] args) throws Throwable {

            /*
             * To create object of queue
             */
            QueueNew2 q = new QueueNew2();

            q.toEnqueue(56);
            q.toEnqueue(30);
            q.toEnqueue(70);

            System.out.println("Queue Front : " + ((q.front != null) ? (q.front).data : -1));

            q.toDequeue();
            q.toDequeue();
            q.toDequeue();

            System.out.println("Queue Rear : " + ((q.rear != null) ? (q.rear).data : -1));
        }
    }

}






