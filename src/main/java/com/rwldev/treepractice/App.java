package com.rwldev.treepractice;

import java.util.Arrays;

/**
 *
 * @author rainw
 */
public class App {

    public static void main(String[] args) {
        Integer resultBFS[], resultDFS[];

        MyTree<Integer> tree = new MyTree<>(NodeInitializer.initNode1());

        resultBFS = tree.bfsTraverse();
        resultDFS = tree.dfsTraverse();

        System.out.println("traverse BFS : " + Arrays.asList(resultBFS));
        System.out.println("traverse DFS : " + Arrays.asList(resultDFS));
    }

}
