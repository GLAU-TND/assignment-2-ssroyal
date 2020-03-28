package problem2.main.Traverse;

import problem1.node.TreeNode;

public class TraverseTree {

    public void getPrefixOrder(TreeNode node) {

        if (node == null)

            return;

        System.out.print(node.getData() + " ");

        getPrefixOrder(node.getLeft());

        getPrefixOrder(node.getRight());

    }
    public void getPostOrder(TreeNode node) {

        if (node == null)

            return;

        getPostOrder(node.getLeft());

        getPostOrder(node.getRight());

        System.out.print(node.getData() + "  ");

    }
    public void getInfixOrder(TreeNode node) {

        if (node == null)

            return;

        getInfixOrder(node.getLeft());

        System.out.print(node.getData() + " ");

        getInfixOrder(node.getRight());

    }

}
