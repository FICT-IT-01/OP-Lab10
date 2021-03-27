package com.kpi.it01;


import com.kpi.it01.interfaces.RandomIntegerGetter;
import com.kpi.it01.task2.Color;
import com.kpi.it01.task2.ColoredPixel;
import com.kpi.it01.task2.Coordinates;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        
        task2();

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
