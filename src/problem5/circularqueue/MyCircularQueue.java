/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem3.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private static Node rear;
    private static int size;

    public MyCircularQueue() {
        rear = null;
        size = 0;
    }
    private static boolean isEmpty() {
        boolean response = false;
        if (rear == null)
            response = true;
        return response;
    }

}
