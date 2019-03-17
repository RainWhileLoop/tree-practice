package com.rwldev.treepractice;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rainw
 */
public class Node<T> {

    private T data;
    private List<Node<T>> children;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void addChild(T childData) {
        if (this.children == null) {
            this.children = new LinkedList<>();
        }
        this.children.add(new Node<>(childData));
    }

    public Node<T> childAt(int index) {
        return this.children.get(index);
    }

}
