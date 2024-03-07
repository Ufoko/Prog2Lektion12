package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98));

        quickWrite(mySet);

        mySet.add(23);

        quickWrite(mySet);

        mySet.remove(67);

        quickWrite(mySet);

        System.out.println(mySet.size());

    }

    private static void quickWrite(Set<Integer> mySet) {
        for (Integer i : mySet) {
            System.out.println("i = " + i);
        }
        System.out.println("\n");
    }
}
