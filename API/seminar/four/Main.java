package Java_project.seminar.four;
/*
 * Замерьте время, за которое в ArrayList добавятся 10000 элементов
 * Замерьте время за которое в Linkedlist добавятся 10000 элементов 
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        LinkedList list2 = new LinkedList();
        long timeStart = System.currentTimeMillis();// метод который возвращает кол-во миллисекунд long используется для одного длинного числа
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart);
    }
}
