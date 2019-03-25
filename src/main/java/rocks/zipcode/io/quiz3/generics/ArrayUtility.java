package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType someType : array){
            if(getNumberOfOccurrences(someType)  % 2 == 1){
                return someType;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType someType : array){
            if(getNumberOfOccurrences(someType) % 2 == 0){
                return someType;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int counter = 0 ;
        for(SomeType someType : array){
            if(someType.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        List<SomeType> filteredList = new ArrayList<>();

        for(SomeType someType : array){
            if(predicate.apply(someType)){
                filteredList.add(someType);
            }
        }

        SomeType[] filteredArray = (SomeType[]) Array.newInstance(array.getClass().getComponentType(), filteredList.size());
        for(int i = 0; i < filteredArray.length; i++){
            filteredArray[i] = filteredList.get(i);
        }
        return filteredArray;
    }
}
