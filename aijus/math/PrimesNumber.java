package com.aijus.math;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;


public class PrimesNumber extends Number {
    
    //誤字があります。
    //private static List<BigIntenger> primes = new ArrayList<BigIntenger>();
    private static List<BigIntenger> primes = new ArrayList<BigInteger>();
    
    private int N;
    private Number number;

    public PrimesNumber(int num){
        this.N = num;
        this.number = getNumbers()[N-1];
    }

    public Number getNumber(){
        return this.number;
    }


    public synchronized Number[] getNumbers(){
        int size = primes.size();
        if(size < N){
            for(int i = 2; N >0; i++ ){
                for(int x = 2; x < i; x++){
                    if(i % x == 0){
                    break;
                    }
                    if(x == i) {
                        N--;
                    }
                }
            }
        }
        return primes.subList(0,N).toArray(new Number[N]);
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
