package com.data_structure;

import com.data_structure.Expressions.ExpressionConverter;
import com.data_structure.LinkedList.LinkedList;
import com.data_structure.Tree.Tree;
import com.data_structure.Tree.TreeNode;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        List<String> keys = new ArrayList<>();
//        keys.add("hello");
//        keys.add("world");
//        TrieNode root = new TrieNode();
//        TrieNode.insert(root, keys.get(0));
//        TrieNode.insert(root, keys.get(1));
//        TrieNode.delete(root, keys.get(1), 0);
//        System.out.println(TrieNode.search(root, keys.get(0)));
//        System.out.println(TrieNode.delete(root, "world", 0));


//        TreeNode treeNode = null;
//        treeNode = BinarySearchTree.insertKey(treeNode, 1);
//        treeNode = BinarySearchTree.insertKey(treeNode, 2);
//        treeNode = BinarySearchTree.insertKey(treeNode, -1);
//        System.out.println(BinarySearchTree.searchKey(treeNode, -1));

//        LinkedList linkedList = new LinkedList();
//        linkedList.insertFirst(2);
//        linkedList.insertFirst(3);
//        linkedList.insertFirst(7);
//        linkedList.insertFirst(4);
//        linkedList.insertFirst(1);
//        linkedList.insertFirst(45);
//        linkedList.bubbleSort();
//        linkedList.printList();
//        LinkedListNode b = new LinkedListNode(9 ,null);
//        LinkedListNode a = linkedList.set(6, b);
//        linkedList.printList();
//        System.out.println(a);

//        linkedList.add(6, 12);
//        linkedList.remove(7);
//        linkedList.printList();

//        ExpressionEvaluator evaluator = new ExpressionEvaluator();
//        String exp = "()([])}";
//        String exp = "(()(()){([()])})(";
//        System.out.println(evaluator.isAccepted(exp));


//        Tree.printTree(treeNode);
//        System.out.println(treeNode.getRight().getRight().getKey());

//        String infix = "3 * (2 + 4 * (5 - 3)) / 4";
//        String infix = "1 * 3 + 2";
//        ExpressionConverter converter = new ExpressionConverter();
//        String postfix = converter.infixToPostfix(infix);
//        System.out.println(postfix);
//        System.out.println(converter.evaluatePostfix(postfix));
//        System.out.println(converter.evaluateInfix("2 + 3 * 5 - (4 - (2 / 5 - 2))"));
//        TreeNode root = new TreeNode("Sales");
//        root.getChildren().add(new TreeNode("domestic"));
//        root.getChildren().add(new TreeNode("international"));
//        root.getChildren().get(1).getChildren().add(new TreeNode("Canada"));
//        root.getChildren().get(1).getChildren().add(new TreeNode("America"));
//        root.getChildren().get(1).getChildren().get(1).getChildren().add(new TreeNode("Africa"));
//        root.getChildren().get(1).getChildren().get(1).getChildren().add(new TreeNode("Asia"));
        TreeNode treeNode = null;
        treeNode = Tree.insertKey(treeNode, "Sales");
        treeNode = Tree.insertKey(treeNode, "Domestic");
        treeNode = Tree.insertKey(treeNode, "International");
        treeNode = Tree.insertKey(treeNode, "Canada");
        treeNode = Tree.insertKey(treeNode, "S. America");
        treeNode = Tree.insertKey(treeNode, "Overseas");
        treeNode = Tree.insertKey(treeNode, "Africa");
        treeNode = Tree.insertKey(treeNode, "Europe");
        treeNode = Tree.insertKey(treeNode, "Asia");
        treeNode = Tree.insertKey(treeNode, "Australia");
        Tree.indentedParentheticRep(treeNode, 0);
    }
}
