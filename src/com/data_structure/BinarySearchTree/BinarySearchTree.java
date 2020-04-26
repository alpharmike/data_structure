package com.data_structure.BinarySearchTree;

public class BinarySearchTree {

    public BinarySearchTree() {

    }

    public static TreeNode insertKey(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        } else {
            if (key < root.key) {
                root.left = insertKey(root.left, key);
            } else {
                root.right = insertKey(root.right, key);
            }
        }
        return root;
    }

    public static boolean searchKey(TreeNode root, int key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        if (key < root.key) {
            return searchKey(root.left, key);
        } else {
            return searchKey(root.right, key);
        }
    }



    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.println(root.key);
        printTree(root.right);
    }
}
