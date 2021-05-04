package functions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Singltone utility class. Converts all string elements of
 * a given list to upper case and orders it in a descending
 * order.
 */
public class DescendingList {

    //init
    private static final DescendingList list = new DescendingList();

    private DescendingList(){};

    public static DescendingList of(){
        return list;
    }

    //business
    public List<String> sortList(List<String> text){
        return text.stream().map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
