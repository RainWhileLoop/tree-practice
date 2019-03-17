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
public class NodeInitializer {

    public static Node<Integer> initNode1() {
        /*
        25
         */
        Node<Integer> node = new Node(25);

        /*
        25 -> 34
        25 -> 17
        25 -> 29
         */
        node.addChild(34);
        node.addChild(17);
        node.addChild(29);

        /*
        25 -> 34 -> 33
        25 -> 34 -> 57
         */
        node.childAt(0).addChild(33);
        node.childAt(0).addChild(57);

        /*
        25 -> 34 -> 57 -> 62
        25 -> 34 -> 57 -> 20
        25 -> 34 -> 57 -> 19
         */
        node.childAt(0).childAt(1).addChild(62);
        node.childAt(0).childAt(1).addChild(20);
        node.childAt(0).childAt(1).addChild(19);

        /*
        25 -> 34 -> 57 -> 19 -> 36
         */
        node.childAt(0).childAt(1).childAt(2).addChild(36);

        /*
        25 -> 17 -> 8
         */
        node.childAt(1).addChild(8);

        /*
        25 -> 29 -> 14
        25 -> 29 -> 49
         */
        node.childAt(2).addChild(14);
        node.childAt(2).addChild(49);

        /*
        25 -> 29 -> 49 -> 28
        25 -> 29 -> 49 -> 11
         */
        node.childAt(2).childAt(1).addChild(28);
        node.childAt(2).childAt(1).addChild(11);

        return node;
    }
}
