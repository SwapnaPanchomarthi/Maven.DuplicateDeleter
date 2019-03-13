package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter()
    {

    }


    public StringDuplicateDeleter(String[] stringArray )
    {
        super();
        this.array=stringArray;
    }
    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        Stream<String> stringArray = Arrays.stream(array)
                                     .filter(string ->numberOfOccurences(string)<maxNumberOfDuplications);
        String[] strArrWithNoDup = stringArray.toArray(String[]::new);
        return strArrWithNoDup;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<String> stringArray = Arrays.stream(array)
                .filter(string ->numberOfOccurences(string)!=exactNumberOfDuplications);
        String[] strArrWithNoDup = stringArray.toArray(String[]::new);
        return strArrWithNoDup;
    }

    public Integer numberOfOccurences(String string)
    {
        Integer count=0;
        for (String s: array) {
            if(s.equals(string))
                count++;
        }
        return count;
    }
}
