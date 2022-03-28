package com.bridgelabz;

import java.util.HashMap;

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

    public HashMapTest() {
        int size = 0;
        table = new MyMapNode[size];
    }

    public void countWords(String str) {
        for (String word : str.split(" ")) {
            System.out.println(" word: " + word);
        }
    }

    public int hash(String key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    static void remove(String str, String word)
    {
        String msg[] = str.split(" ");
        String new_str = "";

        for (String words : msg) {

            // If desired word is found
            if (!words.equals(word)) {
                new_str += words + " ";
            }
        }
        // Print the new String
        System.out.print(new_str);
    }
}

