package problem2.main.Traverse;

import problem1.node.TreeNode;

public class TraverseTree {

    void getPrefixOrder(TreeNode node) {

        if (node == null)

            return;

        System.out.print(node.getData() + " ");

        getPrefixOrder(node.getLeft());

        getPrefixOrder(node.getRight());

    }
    void getPostOrder(TreeNode node) {

        if (node == null)

            return;

        getPostOrder(node.getLeft());

        getPostOrder(node.getRight());

        System.out.print(node.getData() + "  ");

    }

}
