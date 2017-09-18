package com.example.user.wordcounter;

/**
 * Created by user on 18/09/2017.
 */

public class Counter {
    public static int countWords(String string) {
        return string.split(" ").length;
    }
}
