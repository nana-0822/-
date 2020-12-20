package com.aijus.math;


import java.util.List;
import java.util.ArrayList;

import java.math.BigInteger;

public class FibonacciNumber extends Number {
    private int N;
    private Number number;
    private static List<BigInteger> fibonacci = new ArrayList<BigInteger>();
    static {
        fibonacci.add(BigInteger.ZERO);
        fibonacci.add(BigInteger.ONE);
    }

    public FibonacciNumber( int num ) {
        this.N = num;
        this.number = getNumbers()[N-1];
    }

    public Number getNumber() {
        return this.number;
    }

    public synchronized Number[] getNumbers(){
        int size = fibonacci.size();
        if (size < N) {
            for( int i = size; i < N; ++i ) {
                fibonacci.add(fibonacci.get( i-1 ).add( fibonacci.get( i-2 ) ));
            }
        }
        return fibonacci.subList(0, N).toArray(new Number[N]);
    }

    public double doubleValue() {
        return this.number.doubleValue();
    }

    public float floatValue() {
        return this.number.floatValue();
    }

    public int intValue() {
        return this.number.intValue();
    }

    public long	longValue() {
        return this.number.longValue();
    }

}
