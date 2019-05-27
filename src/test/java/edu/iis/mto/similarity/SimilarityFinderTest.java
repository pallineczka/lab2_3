package edu.iis.mto.similarity;

import org.junit.Assert;
import org.junit.Test;

public class SimilarityFinderTest {

    SimilarityFinder similarityFinder = new SimilarityFinder(new DoublerSequenceSearcher());

    @Test
    public void testJackardSimilarityIfSeq1IsNullSeq2IsNull(){
        int[] seq1 = {};
        int[] seq2 = {};
        double expectedResult = 1.0;
        double result = similarityFinder.calculateJackardSimilarity(seq1, seq2);

        Assert.assertEquals(expectedResult, result, 0.1);
    }
}
