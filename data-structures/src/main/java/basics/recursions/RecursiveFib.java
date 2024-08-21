package main.java.basics.recursions;

public class RecursiveFib {

    public int fib(int n) {
        if (n <= 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
