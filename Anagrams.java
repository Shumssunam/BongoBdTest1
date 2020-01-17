package anagrams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        
        String str1;
        String str2;
        
         Scanner input =  new Scanner(System.in);
        System.out.print("Enter string1: ");
        str1 = input.next();
        System.out.print("Enter string2: ");
        str2 = input.next();
        
       // String str1="tablei";
        //String str2="bleat";
        System.out.println("Your Anagram Answer is: "+anagramCheck(str1, str2));
    }
    
    public static boolean anagramCheck(String str1,String str2){
        char[] charArrayFromString1=str1.toCharArray();
        char[] charArrayFromString2=str2.toCharArray();
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);
        
        return Arrays.equals(charArrayFromString1, charArrayFromString2);
    }
}
