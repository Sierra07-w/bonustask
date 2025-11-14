package org.example;

import java.util.ArrayList;
import java.util.List;

public class KMPAlgorithm {

    public static List<Integer> search(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int[] lps = computeLPS(pattern);
        int i = 0, j = 0;

        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                result.add(i - j);
                j = lps[j - 1];
            } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) j = lps[j - 1];
                else i++;
            }
        }
        return result;
    }

    private static int[] computeLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0, i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) length = lps[length - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
