package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        return getIndexOfFirstVowel(word) != -1;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0; i < word.length(); i++){
            if(isVowel(word.toLowerCase().charAt(i))){
                return i;
            }
        }
        return -1;
    }

    public static Boolean startsWithVowel(String word) {
        return getIndexOfFirstVowel(word) == 0;
    }

    public static Boolean isVowel(Character character){
        Character[] characters = {'a', 'e', 'i', 'o', 'u'};
        return Arrays.asList(characters).contains(Character.toLowerCase(character));
    }
}
