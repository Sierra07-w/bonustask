# KMP String Matching Algorithm

## Description
This repository contains an implementation of the **Knuth–Morris–Pratt (KMP) algorithm** for substring search in Java.  
The KMP algorithm efficiently finds all occurrences of a pattern in a given text in linear time using a precomputed LPS (Longest Prefix Suffix) array.

## Files
- `KMPAlgorithm.java` — contains the KMP algorithm implementation.
- `Main.java` — demonstrates the usage of the KMP algorithm with short, medium, and long test strings.

## Usage
1. Clone or download the repository.
2. Compile the Java files:
 KMPAlgorithm.java
 Main.java

3. Run the program:
   Text 1: abcabcabc
Pattern found at positions: [0, 3, 6]
Text 2: ababcabcabababcabc
Pattern found at positions: [2, 5, 12, 15]
Text 3: ababababababababababababababababababababababab
Pattern found at positions: []


## Complexity
- **Time Complexity:** O(n + m)  
  where n = length of text, m = length of pattern.  
- **Space Complexity:** O(m) for storing the LPS array.  

## Test Cases
The algorithm has been tested on:
- **Short string:** `"abcabcabc"`  
- **Medium string:** `"ababcabcabababcabc"`  
- **Long string:** `"ababababababababababababababababababababababab"`  

All tests successfully return the correct positions of the pattern in the text.



