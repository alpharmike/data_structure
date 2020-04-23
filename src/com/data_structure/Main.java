package com.data_structure;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> keys = new ArrayList<>();
        keys.add("hello");
        keys.add("world");
        TrieNode root = new TrieNode();
        TrieNode.insert(root, keys.get(0));
        TrieNode.insert(root, keys.get(1));
        TrieNode.delete(root, keys.get(1));
        System.out.println(TrieNode.search(root, keys.get(0)));
    }
}
