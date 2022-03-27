package com.bridgelabz;

public class HashTable {
    public static void main(String[] args) {
        String str = "To be or not to be";

        HashMapTest hash = new HashMapTest(6);
        hash.countWords(str);
    }
}
