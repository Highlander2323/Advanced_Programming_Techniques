package Lab06_Generics;

import java.util.List;

/**
 * TODO: Implement both utility methods using wildcards.
 * TODO: printAll accepts ANY list regardless of its element type.
 * TODO: sumList accepts only lists whose elements are Numbers (or subtypes).
 */
public class GenericUtils {

    /**
     * TODO: Use an unbounded wildcard List<?> to accept a list of any type.
     * TODO: Print each element on a new line.
     */
    // Prints all elements of any list, regardless of type.
    // Afișează toate elementele oricărei liste, indiferent de tip.
    public static void printAll(/* TODO: wildcard parameter */ List list) {
        // IMPLEMENT
    }

    /**
     * TODO: Use an upper-bounded wildcard List<? extends Number> to accept Integer, Double, etc.
     * TODO: Return the sum of all elements as a double.
     */
    // Returns the sum of all numbers in the list as a double.
    // Returnează suma tuturor numerelor din listă ca double.
    public static double sumList(/* TODO: bounded wildcard parameter */ List list) {
        // IMPLEMENT
        return 0.0;
    }
}
