package org.igormokritsky;


import static org.igormokritsky.util.AnagramCheckerUtil.areAnagrams;

public class App {

    public static void main( String[] args ) {
        String text1 = "listen";
        String text2 = "silent";

        if (areAnagrams(text1, text2)) {
            System.out.println("The two texts are anagrams.");
        } else {
            System.out.println("The two texts are not anagrams.");
        }
    }
}
