package main.java.basics.recursions;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        RecursiveFib fib = new RecursiveFib();

        IntStream.range(0, 20).map(fib::fib).forEachOrdered(System.out::println);

    }
}
