package Java_project.seminar.three;
/*
 * Создать список типо ArrayList
 * Поместить в него как строки так и целые числа
 * Пройтись по списку найти и удалить целые числа
 */

import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add(4);
        list.add(7);
        list.add("10");
        list.add("asdas");
        list.add(4.5);
        list.add(null);
        removeInteger(list);
        System.out.println(list);
    }
    
    static void removeInteger(List<Object> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){// сравниваем текущий элемент с типом integer
                list.remove(i);
                i--;// делается для того чтобы после удаления мы не перескакивали на индекс 
            }
        }
    }
    //  static void removeIntegerV2(List list){  второй метод
    //     Iterator iterator = list.iterator();
    //     while (iterator.hasNext()){
    //         Object object = iterator.next();
    //         if (object instanceof Integer){
    //             iterator.remove();
    //         }
    //     }
    // }
}
