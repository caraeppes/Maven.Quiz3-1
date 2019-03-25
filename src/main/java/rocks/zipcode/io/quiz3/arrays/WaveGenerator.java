package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz3.fundamentals.StringUtils.capitalizeNthCharacter;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        List<String> wave = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))) {
                wave.add(capitalizeNthCharacter(str.toLowerCase(), i));
            }
        }
        return wave.toArray(new String[wave.size()]);
    }
}
