/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwldev.treepractice;

/**
 *
 * @author rainw
 * @param <T> data type of node collected in this Tree
 */
public class MyTree<T> {

    private final Node<T> node;

    public MyTree(Node<T> root) {
        this.node = root;
    }
    
    /**
     * Traverse by Breadth-First Traversals
     * @return data in array order by BFS algorithm
     */
    public T[] bfsTraverse() {
        return null;
    }

    /**
     * Traverse by Depth-First Traversals
     * @return data in array order by DFS algorithm
     */
    public T[] dfsTraverse() {
        return null;
    }

    public Node<T> getNode() {
        return node;
    }
    
}
