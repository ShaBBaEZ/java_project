package Java_project.Home_work.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
 * Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)
 */
public class Main3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Земля","Юпитер","Сатурн","Плутон","Марс","Сатурн","Земля","Земля","Сатурн","Марс"};
        List<String> list = new ArrayList<>(Arrays.asList(arr)); ;
        newList(list);
    }


    public static void newList(List<String> list){ 
        Set<String> newList = new HashSet<>(list);
        for (String i: newList){
            System.out.println(i + ": " + Collections.frequency(list, i)); 
        }
    }
}
