package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double[] numbers = {-5.7, 3.5, 5.6, -7.5, 3.9, -9.9, 9.9, 5.5, -5.6, 2.4, -2.6, -8.0, 7.7, -5.1, 7.9};

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < 0) {
                continue;

            } else {
                System.out.println(numbers[i]);
            }
        }
    }
    public static void hello(){

        int[] num = {-4, -2, 2, 3, 6, 8};
        for (int i = 0; i < num.length; i++) {
            int min = num[i];
            int max = i;
            
            for (int j = 0; j <num.length; j++) {

                if (num[j] < min) ;

                min = num[i];
                max = j;
                if (i != max) {
                    int tmp = num[i];
                    num[i] = num[max];
                    num[max] = tmp;
                }
            }
        }
    }
}