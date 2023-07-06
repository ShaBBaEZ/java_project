package Java_project.seminar.three;
/*
 * Заполнить список десятью случайными числами
 * Отсортировать список методом sort() и вывести его на экран
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Integer[] arr = new Integer[]{5,7,0,2,6,2};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));// Arrays.asList превращает массив в лист
        list.sort(null);// сортировка листа от меньшего к большему
        System.out.println(list);
    }
    
}
