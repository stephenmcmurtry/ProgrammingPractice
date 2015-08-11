package com.stephen;

import com.stephen.Svpino;
import java.io.IOException;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        Svpino svpino = new Svpino();

        // svpino.sumArrays();

        // svpino.mergeArrays();

        // svpino.firstHundredFibonacci();

        svpino.largestNumber();

        try {
            System.in.read();
        } catch(Exception e) {
            throw e;
        }
    }
}
