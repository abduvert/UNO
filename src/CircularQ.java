// Java program for insertion and
// deletion in Circular Queue
import java.io.*;
import java.util.*;

public class CircularQ {


    int size = 0;

    public class Node {
        Players data;
        Node link;
    }

    int count = 0;

    Node front, rear;

    public CircularQ() {
        front = null;
        rear = null;
        count = 0;

    }


    public int size() {
        return size;
    }

    public void enQueue(Players player) {
        Node temp = new Node();
        temp.data = player;
        if (front == null) {
            front = temp;
            size++;
        } else {
            rear.link = temp;
            size++;
        }
        rear = temp;
        rear.link = front;

    }

    public Players deQueue() {


        Players player;
        if (front == rear) {
            player = front.data;
            front = null;
            rear = null;
            size--;
        } else {
            Node temp = front;
            player = temp.data;

            front = front.link;
        }
        rear.link = front;

        size--;


        return player;
    }


    public void displayQueue() {
        Node temp = front;
        System.out.printf(
                "\nPlayers:\n ");
        while (temp.link != front) {
            System.out.println(temp.data.id + " " + temp.data.name);
            temp = temp.link;
        }
        System.out.println(temp.data.id + " " + temp.data.name);
    }

    public Node next(Node temp) {

        temp = temp.link;
        return temp;
    }
}
