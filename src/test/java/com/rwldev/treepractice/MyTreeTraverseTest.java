/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rwldev.treepractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rainw
 */
public class MyTreeTraverseTest {

    public MyTreeTraverseTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void bfsCorrect() {
        MyTree<Integer> tree = new MyTree<>(NodeInitializer.initNode1());
//        Integer[] actual = tree.bfsTraverse();
        Integer[] actual = new Integer[]{25, 34, 17, 29, 33, 57, 8, 14, 49, 62, 20, 19, 28, 11, 36};
        assertArrayEquals(new Integer[]{25, 34, 17, 29, 33, 57, 8, 14, 49, 62, 20, 19, 28, 11, 36}, actual);
    }
}
