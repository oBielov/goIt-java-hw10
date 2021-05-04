package functions;

import java.util.stream.Stream;

/**
 * Singletone utility class. Realisation of linear congruent generator.
 * An algorithm provided to generate a sequence of pseudo-randomized numbers.
 * A quantity of iterations is limited by integer limit argument.
 */
public class LCG {

    //init
    private static final LCG lcg = new LCG();

    private LCG(){}

    public static LCG of(){
        return lcg;
    }

    //business
    public Stream<Long> generator(long a, long c, long m, long seed, int limit){
        return Stream.iterate(seed, n -> (a * n + c) % m).limit(limit);
    }

}
