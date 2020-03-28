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

        else if (x > root.getData()) // x is greater. Should be inserted to right

            root.setRight(insert(root.getRight(), x));

        else // x is smaller should be inserted to left

            root.setLeft(insert(root.getLeft(), x));

        return root;

    }

}
