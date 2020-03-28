/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.Queue;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    static Queue<TreeNode> myQueue;
    public TreeNode insert(TreeNode root, int x) {

        if (root == null)

            return new TreeNode(x);

        else if (x > root.getData())

            root.setRight(insert(root.getRight(), x));

        else
            root.setLeft(insert(root.getLeft(), x));

        return root;

    }
    public void inorderRec(TreeNode root) {

        if (root.getLeft() != null) {

            inorderRec(root.getLeft());

            System.out.println(root.getData());

            inorderRec(root.getRight());

        }

    }

}
