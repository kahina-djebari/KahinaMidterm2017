package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String s1 = "army";
        String s2 = "mary";

        boolean isAnagram = false;

        if (s1.length() == s2.length()) {
            char[] s1AsChar = s1.toCharArray();
            char[] s2AsChar = s2.toCharArray();
            Arrays.sort(s1AsChar);
            Arrays.sort(s2AsChar);
            isAnagram = Arrays.equals(s1AsChar, s2AsChar);
        }

        if(isAnagram==true)
            System.out.println("Strings are Anagram");
        else
            System.out.println("Strings are not Anagram");


    }
}
