package com.data_structure.Tree;

import com.data_structure.Tree.TreeNode;

public class Tree {
    public Tree() {

    }

    public static TreeNode insertKey(TreeNode root, String key) {
        if (root == null) {
            root = new TreeNode(key, 1);
            return root;
        } else {
            if (root.getLevel() + 1 > root.getChildren().size()) {
                root.getChildren().add(new TreeNode(key, root.getLevel() + 1));
            } else {
                insertKey(root.getChildren().get(root.getChildren().size() - 1), key);
            }
        }
        return root;
    }
//
//    public static void printTree(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        printTree(root.left);
//        System.out.println(root.key);
//        printTree(root.right);
//    }

//    public static void printTreePreorder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//
//        System.out.println(root.key);
//        printTree(root.left);
//        printTree(root.right);
//    }



    public static void indentedParentheticRep(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        int index;

        for (index = 0; index < depth; ++index) {
            System.out.print("  ");
        }
        System.out.print(root.getKey());
        if (root.isInternal()) {
            boolean rootProcess = true;
            for (index = 0; index < root.children.size(); ++index) {
                System.out.print(rootProcess ? " (\n" : "\n");
                rootProcess = false;
                indentedParentheticRep(root.getChildren().get(index), depth + 1);
            }
            System.out.print("\n");
            for (index = 0; index < depth; ++index) {
                System.out.print("  ");
            }
            System.out.print(")");
        }
    }


}
