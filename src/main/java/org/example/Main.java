package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] texts = {
                "abcabcabc", 
                "ababcabcabababcabc",
                "ababababababababababababababababababababababab"
        };

        String pattern = "abc";

        for (int k = 0; k < texts.length; k++) {
            System.out.println("Text " + (k + 1) + ": " + texts[k]);
            List<Integer> positions = KMPAlgorithm.search(texts[k], pattern);
            System.out.println("Pattern found at positions: " + positions);
            System.out.println("-----");
        }
    }
}
