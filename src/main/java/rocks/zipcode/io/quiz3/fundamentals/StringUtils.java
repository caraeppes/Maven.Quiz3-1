package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return str.substring(0,indexToCapitalize) + str.toUpperCase().charAt(indexToCapitalize) + str.substring(indexToCapitalize + 1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> substrings = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i + 1; j <= string.length(); j++){
                if(!(substrings.contains(string.substring(i,j)))){
                    substrings.add(string.substring(i, j));
                }
            }
        }
        return substrings.toArray(new String[substrings.size()]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
