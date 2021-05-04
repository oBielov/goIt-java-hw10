package functions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utility class. Converts all string elements of
 * a given list to upper case and orders it in a descending
 * order.
 */
public class DescendingList {

    //business
    public static List<String> sortList(List<String> text){
        return text.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
