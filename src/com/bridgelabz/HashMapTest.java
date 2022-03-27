package com.bridgelabz;
import java.util.HashMap;
import java.util.ArrayList;

public class HashMapTest {

    private static class ListNode {
        int count;
        String key;
        ListNode next;

        public ListNode(String key) {
            this.key = key;
            this.count = 1;
        }
    }

    ListNode table[];

    public HashMapTest(int size) {
        table = new ListNode[size];
    }

    public void countWords(String str) {
        for (String word : str.split(" ")) {
            System.out.println(" word: " + word);
        }
    }
}
