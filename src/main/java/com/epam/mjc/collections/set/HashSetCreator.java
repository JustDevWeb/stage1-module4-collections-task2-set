package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        Iterator<Integer> i = sourceList.iterator();
        while ( i.hasNext() ) {
            Integer x = i.next();
            if ( x % 2 == 0 ) {
                int quotient = x / 2;
                hashSet.add( x );
                if ( quotient % 2 == 0 ) {
                    while ( quotient % 2 == 0 ) {
                        hashSet.add( quotient );
                        quotient = quotient / 2;
                        if( quotient % 2 != 0 ) {
                            hashSet.add(quotient);
                            break;
                        }
                    }
                }
            } else {
                hashSet.add( x );
                hashSet.add( x * 2 );
            }
        }
        return hashSet;
    }
}
