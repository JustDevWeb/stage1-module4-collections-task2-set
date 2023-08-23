package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for( int i : sourceList){
            int square = i * i;
            treeSet.add(square);
        }
        return treeSet.subSet(lowerBound,true,upperBound,true);
    }
}
