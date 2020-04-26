package com.data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TrieNode {
    static final int alphabetSize = 26;

    TrieNode[] children = new TrieNode[alphabetSize];
    boolean endOfWord;

    TrieNode() {
        endOfWord = false;
        for (int index = 0; index < alphabetSize; ++index) {
            this.children[index] = null;
        }
    }

    static void insert(TrieNode root, String key) { // O(key_length)
        int index;
        TrieNode rootCopy = root;
        key = key.toLowerCase();
        System.out.println(key);
        for (index = 0; index < key.length(); ++index) {
            int alphabetIndex = key.charAt(index) - 'a';
            if (rootCopy.children[alphabetIndex] == null) {
                rootCopy.children[alphabetIndex] = new TrieNode();
            }
            rootCopy = rootCopy.children[alphabetIndex];
        }
        rootCopy.endOfWord = true;
    }

    static boolean search(TrieNode root, String key) { // O(key_length)
        int index;
        TrieNode rootCopy = root;
        for (index = 0; index < key.length(); ++index) {
            int alphabetIndex = key.charAt(index) - 'a';
            if (rootCopy.children[alphabetIndex] == null) {
                return false;
            }
            rootCopy = rootCopy.children[alphabetIndex];
        }
        return (rootCopy.endOfWord);
    }

    static boolean isEmpty(TrieNode root) {
        int index;
        for (index = 0; index < alphabetSize; ++index) {
            if (root.children[index] != null) {
                return false;
            }
        }
        return true;
    }

    static void delete(TrieNode root, String key) {
        int index;
        TrieNode rootCopy = root;
        for (index = 0; index < key.length(); ++index) {
            int alphabetIndex = key.charAt(index) - 'a';
            if (rootCopy.children[alphabetIndex] == null) {
                return;
            }
            rootCopy = rootCopy.children[alphabetIndex];
        }

        rootCopy.endOfWord = false;
    }

    static boolean delete(TrieNode root, String key, int index) { // O(key_length)
        System.out.println(index);
        if (root == null) {
            return false;
        } else if (index == key.length()) {
            if (!root.endOfWord) {
                return false;
            }
            root.endOfWord = false;
            System.out.println(isEmpty(root));
            return isEmpty(root);
        }
        int alphabetIndex = key.charAt(index) - 'a';
        TrieNode trieNode = root.children[alphabetIndex];
        if (trieNode == null) {
            return false;
        }
        boolean deleteCurrentNode = delete(trieNode, key, index + 1) && !trieNode.endOfWord;
        if (deleteCurrentNode) {
            root.children[alphabetIndex] = null;
            return isEmpty(trieNode);
        }
        return false;

    }

}
