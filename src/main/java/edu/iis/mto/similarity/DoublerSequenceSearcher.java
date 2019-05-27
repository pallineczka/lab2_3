package edu.iis.mto.similarity;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SearchResult.Builder;
import edu.iis.mto.search.SequenceSearcher;

public class DoublerSequenceSearcher implements SequenceSearcher {

    public static int counter = 0;

    public DoublerSequenceSearcher() {
        counter = 0;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public SearchResult search(int key, int[] seq) {
        Builder builder = SearchResult.builder();
        counter++;
        for(int i = 0; i < seq.length; i++) {
            if(key == seq[i]) {
                builder.withFound(true);
                builder.withPosition(i);
            }
        }
        return builder.build();
    }
}
