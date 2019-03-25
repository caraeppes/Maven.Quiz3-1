package rocks.zipcode.io.quiz3.fundamentals;

import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.*;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        String[] words = str.split(" ");

        if (words.length <= 1) {
            translateWord(str);
        }

        String result = "";
        for (String word : words) {
            result += translateWord(word) + " ";
        }
        return result.substring(0, result.length() - 1);
    }

    public String translateWord(String str) {
        if (startsWithVowel(str)) {
            return str + "way";
        }
        if (hasVowels(str)) {
            return str.substring(getIndexOfFirstVowel(str)) + str.substring(0, getIndexOfFirstVowel(str)) + "ay";
        }
        return str + "ay";
    }
}