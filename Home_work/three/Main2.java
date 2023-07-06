package java_project.Home_work.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
 */
public class Main2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{16,3,8,6,64,77,98,100,88,33};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Минимальное значение равно:" + minArr(list));
        System.out.println("Максимальное значение равно:" + maxArr(list));
        System.out.println("Среднее арифмитическое равно:" + average(list));
        
    }
    

    public static double average(List<Integer> list){
        double number = 0;
        for (int i = 0; i < list.size(); i++) {
            number += list.get(i);
        }
        number = number / list.size();
        return number;
    }

    public static Integer maxArr(List<Integer> list){
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static Integer minArr(List<Integer> list){
        Integer min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        return min;
    }

}
