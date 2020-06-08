package com.benedicth;

import java.util.*;

public class SockLaundry {

    public Integer getMaximumPairOfSocks(Integer noOfWashes, Integer[] cleanPile, Integer[] dirtyPile)
    {
        System.out.println(Arrays.toString(cleanPile));
        System.out.println(Arrays.toString(dirtyPile));
        return calculateDifference(cleanPile, dirtyPile, noOfWashes);
    }

    private int calculateDifference(Integer[] clean, Integer[] dirty, Integer noOfWashes){

        Double outCome = 0.0;
        Map<Integer,Integer> sortedSocks = new HashMap<Integer,Integer>();
        List<Integer> searchableClean = new LinkedList<Integer>(Arrays.asList(clean));
        for (Integer sock : clean) {
            int foundCleanSockIndex = searchableClean.indexOf(sock);
            if(foundCleanSockIndex != -1) {
                searchableClean.remove(foundCleanSockIndex);
                if(sortedSocks.containsKey(sock)) sortedSocks.put(sock, sortedSocks.get(sock) + 1);
                else sortedSocks.put(sock,1);
            }
        }


        if(noOfWashes == 0){
            //Traversing All Sorted Same Types of Socks
            for(Map.Entry entry : sortedSocks.entrySet()){
                Integer totalSortedSameTypeOfSocks = (Integer) entry.getValue();
                if((totalSortedSameTypeOfSocks/2) >= 1){
                    outCome = outCome + Math.floor(totalSortedSameTypeOfSocks/2);
                }
            }
        }else{
            List<Integer> searchableDirtyForCleanMatch = new LinkedList<Integer>(Arrays.asList(dirty));
            //Find Matching sorted clean socks in dirty pile
            int countWashAsCleanMatchesInDirtyPile = 0;
            for(Map.Entry entry : sortedSocks.entrySet()){
                if((Integer) entry.getValue() % 2 > 0){
                    while(searchableDirtyForCleanMatch.indexOf((Integer) entry.getKey()) != -1){
                        countWashAsCleanMatchesInDirtyPile++;
                        searchableDirtyForCleanMatch.remove(searchableDirtyForCleanMatch.indexOf((Integer) entry.getKey()));
                        sortedSocks.put((Integer) entry.getKey(), sortedSocks.get((Integer) entry.getKey()) + 1);

                        if(countWashAsCleanMatchesInDirtyPile == noOfWashes) break;

                    }

                    if(countWashAsCleanMatchesInDirtyPile == noOfWashes) break;
                }
            }

            //Sort from the remaining dirty pile of socks given that there is still no of wash slot left
            if(countWashAsCleanMatchesInDirtyPile < noOfWashes){
                List<Integer> remainingDirtyAfterCleanMatch = new LinkedList<Integer>(searchableDirtyForCleanMatch);
                for (Integer dirtySock : remainingDirtyAfterCleanMatch) {
                    if(countWashAsCleanMatchesInDirtyPile == noOfWashes) break;
                    int foundDirtySockIndex = searchableDirtyForCleanMatch.indexOf(dirtySock);
                    if(foundDirtySockIndex != -1) {
                        searchableDirtyForCleanMatch.remove(foundDirtySockIndex);
                        if(sortedSocks.containsKey(dirtySock)) sortedSocks.put(dirtySock, sortedSocks.get(dirtySock) + 1);
                        else sortedSocks.put(dirtySock,1);
                    }
                    countWashAsCleanMatchesInDirtyPile++;
                }
            }


            for(Map.Entry entry : sortedSocks.entrySet()){
                Integer totalSortedSameTypeOfSocks = (Integer) entry.getValue();
                if((totalSortedSameTypeOfSocks/2) >= 1){
                    outCome = outCome + Math.floor(totalSortedSameTypeOfSocks/2);
                }
            }
        }
        return (int) outCome.doubleValue();
    }
}
