package com.benedicth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {

    public Integer maxNumberPairs(Integer noOfWashes, Integer[] cleanPile, Integer[] dirtyPile)
    {
        System.out.println(Arrays.toString(cleanPile));
        System.out.println(Arrays.toString(dirtyPile));
        return calculateDifference(cleanPile, dirtyPile, noOfWashes);
    }

    private int calculateDifference(Integer[] arrA, Integer[] arrB, Integer limitArrB){
        ArrayList<Integer> resultArrList = new ArrayList<Integer>();
        Integer[] newArrB = new Integer[limitArrB];
        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);
        System.arraycopy(arrB,0,newArrB,0,limitArrB);
        Integer countLeftOver = 1;
        for (int i = 0; i < newArrB.length; i++) {
            if (java.util.Arrays.binarySearch(arrA,newArrB[i]) >= 0) {
                resultArrList.add(newArrB[i]);
            }else{
                //if(!newArrB[i].equals(index)) countLeftOver = 1;
                System.out.println("Others: "+ newArrB[i]);
                resultArrList.add(newArrB[i]);
            }
        }
        resultArrList.addAll(Arrays.asList(arrA));
        java.util.Arrays.sort(arrA);
        Collections.sort(resultArrList);
        System.out.println(resultArrList.toString());
        Integer index = resultArrList.get(0);
        Integer count = 1;
        Double maxPairs = 0.0;
        for (int i = 0; i < resultArrList.size(); i++) {
            if(!resultArrList.get(i).equals(index)) count = 1;
            Double currentCount = Math.floor((count++)/2);
            if(currentCount != 0.0)
            {
                int next = (i+1) > resultArrList.size()? resultArrList.size() - 1 : i+1;
                if(resultArrList.get(i) < resultArrList.get(next))
                {
                    maxPairs = maxPairs + currentCount;
                    System.out.println("Counts for "+resultArrList.get(i) + ", pair: " +currentCount);
                }
            }
            index = resultArrList.get(i);
        }
        return (int)maxPairs.doubleValue();
    }
}
