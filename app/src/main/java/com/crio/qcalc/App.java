/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package com.crio.qcalc;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

         StandardCalculator calc = new StandardCalculator();
        calc.add(1,2);
        calc.subtract(10,5);
        calc.multiply(5,5);
        calc.divide(10,5);
        //System.out.println(calc.getResult());
        

        ScientificCalculator scalc = new ScientificCalculator();
        double cube = scalc.cubeOf(5);
        int modulo = scalc.modulo(4, 2);
        double square = scalc.squareOf(4);
        double powerOf = scalc.powerOf(5,2);
        double squareOf = scalc.squareOf(6);
        double modulo_double = scalc.modulo_double(2,5);


        System.out.println("Cube =" + cube);
        System.out.println("Modulo =" + modulo);
        System.out.println("Square of" + square);
        System.out.println("Power of"+powerOf);
        System.out.println("Square root of " + squareOf);
        System.out.println("Modulo of " + modulo_double);
    }
}

