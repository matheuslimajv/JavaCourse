package com.javacourse.class56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        for (EnumCalculator calculator : EnumCalculator.values()){
            System.out.println(calculator.executeOperation(x, y));
            System.out.println(calculator);
        }
    }
}
