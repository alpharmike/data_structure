package com.data_structure;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> data;
    private int top;

    public Stack() {
        this.data = new ArrayList<>();
        this.top = 0;
    }

    public void push(Object newElement) {
        this.data.add(newElement);
        this.setTop(this.top + 1);
    }

    public Object pop() {
        if (this.isEmpty()) {
            return null;
        }
        this.setTop(this.top - 1);
        Object element = this.data.get(this.top);
        this.data.remove(this.top);
        return element;
    }

    public void makeEmpty() {
        while (!this.isEmpty()) {
            this.pop();
        }
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public boolean isEmpty() {
        return this.getTop() == 0;
    }

    public Object getTopElement() {
        if (this.isEmpty()) {
            return null;
        }

        return this.data.get(this.top - 1);
    }
}
