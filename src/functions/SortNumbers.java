package functions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Singletone utility class. Gets all numbers from a given array
 * and order them in natural order (big-endian).
 */
public class SortNumbers {

    //init
    private static final SortNumbers sortNumbers = new SortNumbers();

    private SortNumbers(){}

    public static SortNumbers of(){
        return sortNumbers;
    }

    //business
    public String sortNumbers(String[] array){
        return Arrays.stream(array).flatMap(n->Arrays.stream(n.split(", ")))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(", "));
    }

}
