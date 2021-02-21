/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        TreeNode rootNode = new TreeNode(61);
        tree.insert(rootNode,51);
        tree.insert(rootNode,39);
        tree.insert(rootNode,31);
        tree.insert(rootNode,54);
        tree.insert(rootNode,92);
        tree.insert(rootNode,42);
        MyQueue mq = new MyQueue();

        mq.storePreSuccessor(rootNode);
        System.out.print("\nPre-Order successor of all the nodes :-  ");

        mq.printQueue();
    }
}
