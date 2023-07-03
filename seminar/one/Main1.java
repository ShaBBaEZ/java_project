package java_project.seminar.one;

import java.util.Arrays;
import java.util.Random;

public class Main1 {
    /*
     * Дан массив двоичных чисел,например [1,1,0,1,1,1]
     * вывести максимальное количество подряд идущих 1.
     */
    public static void main(String[] args){
        int[] arr = random(10,0,2);// здесьь мы как раз вводим значения которые будут рандомиться в методе рандоме который ниже
        System.out.println(Arrays.toString(arr));// принт массива
        System.out.println(count(arr));// выводим то что у нас вернётся в метод count(return max_count)
    }
    static int[] random(int col, int min, int max){
        int[] arr = new int[col]; //создаём массив на то что введётся в программе 
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min,max);  // заполняем массив рандомными числами которые в значении от мин до макс которые мы введём         
        }
        return arr;
    }
    static int count(int[] arr){// создаём метод который будет считать количество подряд идущих 1
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                count++;
                if (max_count < count){
                    max_count = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max_count;
    } 
}
