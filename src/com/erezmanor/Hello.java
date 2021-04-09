package com.erezmanor;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;

public class Hello {

    public static void main(String[] args){
        Random random = new Random();
        System.out.println("Hello World!");

        ArrayList<Integer> lam = new ArrayList<>();
        for (int i=0 ; i<10; i++){

            int rand = random.nextInt(10000);
            lam.add(rand);
        }

        lam.forEach((x) -> {System.out.println(x);});

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );


    }

    interface StringFunction {
        String run(String str);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
