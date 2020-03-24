/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

import java.util.NoSuchElementException;

public class MyPriorityQueue<E> {
    private Node<E> front;
    private Node<E> rear ;
    private int size;
    public boolean offer(E item) {
        if(front==null)
        {
            rear= new Node<>(item);
            front=rear;

        }
        else
        {
            rear.setNext(new Node<>(item));
            rear=rear.getNext();
        }
        size++;
        return true;
    }
    public E poll() {
        if(front==null)
        {
            return null;
        }
        else{
            E temp = front.getData();
            front = front.getNext();
            size--;
            return temp;
        }

    }
}
