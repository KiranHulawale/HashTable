package com.bridgelabz;
import java.util.HashMap;
import java.util.ArrayList;

public class HashMapTest {

    private static class MyMapNode {
        int count;
        String key;
        MyMapNode next;

        public MyMapNode(String key) {
            this.key = key;
            this.count = 1;
        }
    }

    MyMapNode table[];

    public HashMapTest(int size) {
        table = new MyMapNode[size];
    }

    public void countWords(String str) {
        for (String word : str.split(" ")) {
            System.out.println(" word: " + word);
        }
    }
}
