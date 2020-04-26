package com.data_structure;

import BinarySearchTree.BinarySearchTree;
import BinarySearchTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

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


        TreeNode treeNode = null;
        treeNode = BinarySearchTree.insertKey(treeNode, 1);
        treeNode = BinarySearchTree.insertKey(treeNode, 2);
        treeNode = BinarySearchTree.insertKey(treeNode, -1);
        BinarySearchTree.printTree(treeNode);
    }
}
