package functions;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Singltone utility class. Returns string with elements of uneven indices
 * from a given list.
 */
public class UnevenNames {

//init
    private static final UnevenNames unevenNames = new UnevenNames();

    private UnevenNames(){}

    public static UnevenNames of(){
        return unevenNames;
    }

//business

    /**
     * Returns string through streamed list of string values.
     * Gets every uneven element of a list, enumerates it and stores
     * it ina a string with stream().collect
     * @param names list of strings
     * @return String with all elements with uneven indices
     */
    public String returnUnevenNames(List<String> names){
        return names.stream().filter(name -> names.indexOf(name)%2 == 0)
                .map(name -> names.indexOf(name)+1 + ". " + name)
                .collect(Collectors.joining(", "));
    }

}
