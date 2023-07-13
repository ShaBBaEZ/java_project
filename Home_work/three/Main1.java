package Java_project.Home_work.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Main1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,3,8,6,64,77,98,100,88,33};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        delEven(list);
        System.out.println(list);
    }

    public static void delEven(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }
}
