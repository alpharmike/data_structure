package com.data_structure.LinkedList;

public class LinkedList {
    LinkedListNode root;

    public LinkedList() {
        this.root = null;
    }

    public void insertFirst(int data) {
        LinkedListNode newNode = new LinkedListNode();
        newNode.data = data;
        newNode.next = null;
        if (this.root == null) {
            this.root = newNode;
        } else {
            LinkedListNode rootCopy = this.root;
            this.root = newNode;
            this.root.next = rootCopy;
        }
    }

     public void printList() {
        LinkedListNode rootCopy = this.root;
        while (rootCopy != null) {
            System.out.println(rootCopy.data);
            rootCopy = rootCopy.next;
        }
    }

    public void bubbleSort() {
        if (this.root == null || this.root.next == null) {
            return;
        }

        LinkedListNode currNode = this.root;
        LinkedListNode nextNode;
        while (currNode.next != null) {
            nextNode = currNode.next;
            while (nextNode != null) {
                if (nextNode.data < currNode.data) {
                    int temp = currNode.data;
                    currNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;

            }
            currNode = currNode.next;
        }
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        LinkedListNode rootCopy = this.root;
        int nodeCount = 0;
        while (rootCopy != null) {
            ++nodeCount;
            rootCopy = rootCopy.next;
        }
        return nodeCount;
    }

    public LinkedListNode get(int nodeIndex) {
        LinkedListNode targetNode = this.root;
        while (targetNode != null && nodeIndex != 0) {
            targetNode = targetNode.next;
            --nodeIndex;
        }
        if (targetNode == null) {
            System.out.println("Provided index exceeds the maximum index of the array!");
        }

        return targetNode;
    }

    public LinkedListNode set(int index, LinkedListNode element) {
        LinkedListNode targetNode = this.root;
        LinkedListNode prevNode = targetNode;
        while (targetNode != null && index != 0) {
            prevNode = targetNode;
            targetNode = targetNode.next;
            --index;
        }
        if (targetNode == null) {
            System.out.println("Provided index exceeds the maximum index of the array!");
            return null;
        }
        prevNode.next = element;
        element.next = targetNode.next;
        return targetNode;
    }

    public void add(int index, int element) {
        if (index > this.size()) {
            System.out.println("Provided index exceeds the maximum index of the array!");
            return;
        }

        LinkedListNode targetNode = this.root;
        LinkedListNode prevNode = targetNode;
        while (targetNode != null && index != 0) {
            prevNode = targetNode;
            targetNode = targetNode.next;
            --index;
        }

        LinkedListNode newNode = new LinkedListNode();
        newNode.data = element;
        newNode.next = targetNode;
        prevNode.next = newNode;
    }

    public LinkedListNode remove(int index) {
        LinkedListNode targetNode = this.root;
        LinkedListNode prevNode = targetNode;
        while (targetNode != null && index != 0) {
            prevNode = targetNode;
            targetNode = targetNode.next;
            --index;
        }

        if (targetNode == null) {
            System.out.println("Provided index exceeds the maximum index of the array!");

            return null;
        }
        prevNode.next = targetNode.next;
        return targetNode;
    }



}
