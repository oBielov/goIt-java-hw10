package functions;

import java.util.Iterator;
import java.util.stream.Stream;

/**
 * Singletone utility class. Takes two streams, mixes it while at least
 * one stream has next element and stores the mix in another stream.
 */
public class StreamMix {

    //init
    private static final StreamMix streamMix = new StreamMix();

    private StreamMix(){};

    public static StreamMix of(){
        return streamMix;
    }

    //business
    public static <T> Stream<T> zip (Stream<T> first, Stream<T> second){
        //iterators for input streams
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();

        //empty stream to store mix
        Stream<T> mix = Stream.empty();

        //loop through input streams
        while(firstIterator.hasNext() & secondIterator.hasNext()){
            mix = Stream.concat(mix, Stream.of(firstIterator.next(), secondIterator.next()));
        }
        return mix;
    }

}
