package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {



    public IntegerDuplicateDeleter() {

    }


    public IntegerDuplicateDeleter(Integer[] intArray) {
        super();
        this.array = intArray;

    }




    @Override
    public Integer[] removeDuplicates( int maxNumberOfDuplications) {

        Stream<Integer> arrayWithNoDup = Arrays.stream(array)
                                        .filter(number -> numOfOccurences(number)<maxNumberOfDuplications);

        Integer[] deletedDup = arrayWithNoDup.toArray(Integer[]::new);

        return deletedDup;

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Stream<Integer> arrayWithNoExact = Arrays.stream(array)
                                           .filter(number -> numOfOccurences(number)!=exactNumberOfDuplications);

        Integer[] deleteDup = arrayWithNoExact.toArray(Integer[]::new);
        return deleteDup;
    }

   public Integer numOfOccurences(Integer number) {
        Integer count=0;
        for(Integer i:array)
        {
            if(number.equals(i))
                count++;
        }


       return count;

   }


    }
