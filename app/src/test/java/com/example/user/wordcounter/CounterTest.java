package com.example.user.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 18/09/2017.
 */
public class CounterTest {

    Counter counter;

    @Test
    public void canCountWords() {
        assertEquals( 5, counter.countWords("Can I count these words?"));
    }

}