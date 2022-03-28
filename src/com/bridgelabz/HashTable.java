package com.bridgelabz;

public class HashTable{
    public static void main(String[] args) {

        String str = "Paranoids are not paranoid because "
                + "they are paranoid but because they keep "
                + "putting themselves deliberately into paranoid "
                + "avoidable situations";

        String word = "avoidable";

        HashMapTest hash = new HashMapTest();
        hash.countWords(str);
        hash.remove(str, word);
    }

}

