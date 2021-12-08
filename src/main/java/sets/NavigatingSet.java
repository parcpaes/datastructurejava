package sets;

import java.io.*;
import java.util.*;

public class NavigatingSet {
    public static void main(String[] args) {
        NavigableSet<Integer> original = new TreeSet<>();
        original.add(1);
        original.add(3);
        original.add(2);
        SortedSet<Integer> headset = original.headSet(3);
        System.out.println(Arrays.toString(headset.toArray()));

    }
}
