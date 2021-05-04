package functions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {


        String[] array = {"Alex", "Ivan", "Peter", "Johansson", "Turku", "Alina", "Elena"};
        String[] numArray = {"1, 2, 0", "4, 5"};
        String[] text1 = {"Alex", "Ivan", "Peter"};
        String[] text2 = {"Johansson", "Turku", "Alina"};

        Stream<String> mixedTextStream = StreamMix.zip(Arrays.stream(text1), Arrays.stream(text2));
        String sorted = UnevenNames.returnUnevenNames(Arrays.asList(array));
        List<String> descendSort = DescendingList.sortList(Arrays.asList(array));
        String sortedNums = SortNumbers.sortNumbers(numArray);
        Stream<Long> code = LCG.generator(25214903917L, 11L, (long) Math.pow(2, 48), 44L, 10);

        System.out.println(sorted + "\n");
        System.out.println(descendSort + "\n");
        System.out.println(sortedNums + "\n");
        System.out.println(code.collect(Collectors.toList()) + "\n");
        System.out.println(mixedTextStream.collect(Collectors.joining(", ")));

    }

}
