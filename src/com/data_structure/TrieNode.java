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

    static void insert(TrieNode root, String key) {
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

    static boolean search(TrieNode root, String key) {
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

}
