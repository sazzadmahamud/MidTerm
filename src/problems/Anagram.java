package problems;

import java.util.Arrays;
/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    private static boolean isAnagram(String first, String second){
        if(first.length() != second.length()){
            return  false;
        }
        first = sortingCharacter(first);
        second = sortingCharacter(second);
        return  first.equals(second);
    }
    private static String sortingCharacter(String string) {
        char[] charArray = string.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String first = "CAT";
        String second = "ACT";
        String thired  = "ARMY";
        String fourth = "MARY";

        if(isAnagram(first, second)){
            System.out.println(second + " is anangram of " + first);
        }if(isAnagram(thired,fourth)){
            System.out.println(thired + " is anangram of " + fourth);
        }else {
            System.out.println("String is not anangram");
        }
    }
}



