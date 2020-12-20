package com.aijus.main;

import java.util.List;
import java.util.ArrayList;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import com.aijus.math.FibonacciNumber;
import com.aijus.math.PrimesNumber;

public class NumbersMain {
    public static void main( String[] args ) throws IOException {


      System.out.println("第N番目のフィボナッチ数 及び フィボナッチ数列を表示します。");

      do{
          System.out.println("入力してください。( exit または quitで終了します。)");
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();


                if (input.equals("exit") || input.equals("quit")) {
                  System.out.println("プログラムを終了します。");
                    break;
                }

                long numl = Long.parseLong(input);
                if(numl >= 1L && numl <= 70L) {
                    int num = Integer.parseInt( input );
                    FibonacciNumber fibonacci = new FibonacciNumber( num );
                    PrimesNumber primes =new PrimesNumber(num);

                    System.out.println("第"+ num + "番目の素数　: "+ primes.getNumber());

                    System.out.println("第" + num + "番目のフィボナッチ数　 : " + fibonacci.getNumber());

                    System.out.print("第" + num + "番目のフィボナッチ数列 : ");
                    String separator = "";
                    for ( Number fibonacciI : fibonacci.getNumbers() ) {
                        System.out.print(separator + fibonacciI);
                        separator = " , ";
                    }
                    System.out.println("");
                }
                else {
                  System.out.print("数値は1以上70以下を");
                }
            }
            catch ( NumberFormatException e ) {
              System.out.println("文字列の入力は exit または quit しか受け付けません。");
              System.out.print("もう一度");
          }
          catch ( OutOfMemoryError e ) {
              System.out.println("数値が大きすぎるため計算できません。");
              System.out.print("もう一度");
            }
        }
        while( true );
    }
}
