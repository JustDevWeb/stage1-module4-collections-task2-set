package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> hashSetCombined = new HashSet<>(firstSet);
        hashSetCombined.retainAll(secondSet);
        HashSet<String> finalHashset = new HashSet<>(thirdSet);
        finalHashset.removeAll(firstSet);
        finalHashset.removeAll(secondSet);
        finalHashset.addAll(hashSetCombined);

        return finalHashset;
    }
}
