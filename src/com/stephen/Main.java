package com.stephen;

import com.stephen.Svpino;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Svpino svpino = new Svpino();

        svpino.sumArrays();

        try {
            System.in.read();
        } catch(Exception e) {
            throw e;
        }
    }
}
