package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> values = new HashSet<>();

        for (Integer number : sourceList) {
            while (number % 2 == 0) {
                values.add(number);
                number /= 2;
            }

            values.add(number);
            values.add(number * 2);
        }

        return values;
    }
}
