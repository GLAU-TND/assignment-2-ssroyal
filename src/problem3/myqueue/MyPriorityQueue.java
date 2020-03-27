/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

import java.util.NoSuchElementException;

public class MyPriorityQueue {
    private Node front;
    private Node rear;
    private  int size;

    public boolean offer( Student item) {
        if (front == null) {
            rear = new Node(item);
            front = rear;

        } else {
            rear.setNext(new Node(item));
            rear = rear.getNext();
        }
        size++;
        return true;
    }

    public Student poll() {
        if (front == null) {
            return null;
        } else {
            Student temp = front.getData();
            front = front.getNext();
            size--;
            return temp;
        }

    }

    public  Student peek() {
        if (front == null)
            return null;
        else {
            return front.getData();
        }
    }

    public  Student remove() {
        if (front == null) {
            throw new NoSuchElementException("Queue is Empty");
        } else {
             Student item = peek();
            front = front.getNext();
            size--;
            return item;
        }
    }
    public  Student element() {
        if (front == null)
            throw new NoSuchElementException("Queue Is Empty");
        else {
            return front.getData();
        }
    }
    public Node getNode(int index)
    {
        Node response = this.front;
        for (int i = 0; i < index; i++) {
            response= response.getNext();
        }
        return response;

    }
}
