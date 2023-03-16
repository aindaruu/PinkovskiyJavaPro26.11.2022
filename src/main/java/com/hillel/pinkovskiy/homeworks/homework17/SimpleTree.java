package com.hillel.pinkovskiy.homeworks.homework17;

public class SimpleTree {
    private TreeNode root;

    public SimpleTree() {
        root = null;
    }

    public void add(int val) {
        root = addNode(root, val);
    }

    private TreeNode addNode(TreeNode node, int val) {
        if (node == null) {
            node = new TreeNode(val);
            return node;
        }

        if (val < node.val) {
            node.left = addNode(node.left, val);
        } else if (val > node.val) {
            node.right = addNode(node.right, val);
        }

        return node;
    }

    public void traverse() {
        traverseInOrder(root);
    }

    private void traverseInOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        traverseInOrder(node.left);
        System.out.print(node.val + " ");
        traverseInOrder(node.right);
    }

}
