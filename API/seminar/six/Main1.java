package Java_project.seminar.six;
/*
 * Напишите метод который заполнит массив из 1000 элементов случайными числами от 0 - 24
 * Создать метод в который передайте заполненный выше массив
 * и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой
 * для вычислений процента используйте формулу
 * процент уникальных чисел = кол-во уникальных чисел * 100 / общее количество чисел в массиве
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Integer[] arr = createArray(1000,0,24);
        System.out.println(Arrays.toString(arr));
        System.out.println("Процент уникальности: " + getInicPercent(arr));
        
    }

    static double getInicPercent(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double result = set.size() * 100.0 / arr.length;
        return result;
    }

    static  Integer[] createArray(int capacity, int min, int max){
        Integer[] arr = new Integer[capacity];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(max - min + 1) + min;
        }
        return arr;
    }
}
