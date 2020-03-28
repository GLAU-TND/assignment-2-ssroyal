package problem2.main.Traverse;

import problem1.node.TreeNode;

public class TraverseTree {
    void getPostOrder(TreeNode node) {

        if (node == null)

            return;

        getPostOrder(node.getLeft());

        getPostOrder(node.getRight());

        System.out.print(node.getData() + "  ");

    }

}
