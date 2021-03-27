package com.kpi.it01;


import com.kpi.it01.interfaces.RandomIntegerGetter;
import com.kpi.it01.interfaces.Task1Calculator;
import com.kpi.it01.task2.Color;
import com.kpi.it01.task2.ColoredPixel;
import com.kpi.it01.task2.Coordinates;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        System.out.println("TASK#1");
        task1();

        System.out.println("\nTASK#2");
        task2();

    }

    public static void task1(){

        Task1Calculator calc1 = (a,b,c,d) -> Math.sqrt(Math.abs(Math.sin(a) - ((4*Math.log(b))/Math.pow(c, d))));
        Task1Calculator calc2 = (a,b,c,d) -> ((Math.pow(Math.E, a) + 3*Math.log(c))/(Math.sqrt(Math.pow(b,c)))) * Math.atan(d);
        Task1Calculator calc3 = (a,b,c,d) -> Math.pow(2*Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c))), d);

        printCalcResult(calc1,2.34,0.756,2.23,-1.653);
        printCalcResult(calc2,2.34,0.756,2.23,-1.653);
        printCalcResult(calc3,2.34,0.756,2.23,-1.653);

    }

    private static void printCalcResult(Task1Calculator calculator, double a, double b, double c, double d){
        System.out.println(calculator.calcualte(a,b,c,d));
    }

    public static void task2(){
        RandomIntegerGetter random = () -> ThreadLocalRandom.current().nextInt(0, 256);

        ArrayList<ColoredPixel> pixels = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            pixels.add(
                    new ColoredPixel(
                            new Coordinates(random.getInt(), random.getInt()),
                            new Color(random.getInt(),random.getInt(),random.getInt())
            ));
        }

        pixels.forEach(pixel -> System.out.println(pixel));
        // The same 👇
        //pixels.forEach(System.out::println);
    }
}
