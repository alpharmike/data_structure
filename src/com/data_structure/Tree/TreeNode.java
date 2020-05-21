package com.data_structure.Tree;

import java.util.ArrayList;

public class TreeNode {
    int level;
    String key;
    ArrayList<TreeNode> children;

    public TreeNode(String key, int level) {
        this.key = key;
        this.level = level;
        this.children = new ArrayList<>();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeNode> children) {
        this.children = children;
    }

    public boolean isInternal() {
        return this.getChildren().size() > 0;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
