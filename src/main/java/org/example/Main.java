package org.example;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        FuctionalInterface ob = new Implementation();
        ob.sayLambda();
        FuctionalInterface ob1 = new FuctionalInterface() {
            @Override
            public void sayLambda() {
                System.out.println("Lambda!!");
            }
        };
        ob1.sayLambda();
        //implementing sayLambda function using lambda
        FuctionalInterface ob3 = () -> System.out.println("Lambda!!");
        ob3.sayLambda();

        //implementing calculate(..) function using lambda


        Calculator calculator = (int a,int b) ->  a+b;
        System.out.println(calculator.calculate(1,2));

        //writing lambda expressions using existing functional interface which has been provided by java
        IntBinaryOperator cal = (int a,int b) -> a+b;
        System.out.println(cal.applyAsInt(1,2));


    }
}