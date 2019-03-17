/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwldev.treepractice;

/**
 *
 * @author rainw
 */
public class App {

    public static void main(String[] args) {

        Node<Integer> node = initialData();

        Integer resultBFS[], resultDFS[];

        resultBFS = TreeSearcher.bfs(node);
        resultDFS = TreeSearcher.dfs(node);

        System.out.println("traverse BFS : " + resultBFS);
        System.out.println("traverse DFS : " + resultDFS);
    }

    private static Node initialData() {
        Node<Integer> node = new Node(25);
        return node;
    }
}
