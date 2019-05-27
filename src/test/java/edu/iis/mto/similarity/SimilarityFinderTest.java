package edu.iis.mto.similarity;

import org.hamcrest.Matchers;
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

        Assert.assertThat(result, Matchers.equalTo(expectedResult));
    }

    @Test
    public void testJackardSimilarityWhenOneSeqIsNull(){
        int[] seq1 = {};
        int[] seq2 = {1, 2, 3};
        double expectedResult = 0.0;
        double result = similarityFinder.calculateJackardSimilarity(seq1, seq2);

        Assert.assertThat(result, Matchers.equalTo(expectedResult));
    }

    @Test
    public void testJackardSimilarityWhenSeq1AndSeq2IsTheSame(){
        int[] seq1 = {1, 2, 3};
        int[] seq2 = {1, 2, 3};
        double expectedResult = 1.0;
        double result = similarityFinder.calculateJackardSimilarity(seq1, seq2);

        Assert.assertThat(result, Matchers.equalTo(expectedResult));
    }
}
