package com.javacourse.class56;

public enum EnumCalculator {

    SUM('+'){
        @Override
        public double executeOperation(double x, double y) {
            return x + y;
        }
    },

    SUBTRACTION('-'){
        @Override
        public double executeOperation(double x, double y) {
            return x - y;
        }
    },

    MULTIPLICATION('*'){
        @Override
        public double executeOperation(double x, double y) {
            return x * y;
        }
    },

    DIVISION('/'){
        @Override
        public double executeOperation(double x, double y) {
            return x / y;
        }
    };

    final char operator;

    EnumCalculator(char operator){
        this.operator = operator;
    }


    public abstract double executeOperation(double x, double y);

    public String toString(){
        return String.valueOf(operator);
    }
}
