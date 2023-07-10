package java_project.Home_work.four;

import java.util.Iterator;
import java.util.LinkedList;


/*
 * Найдите сумму всех элементов LinkedList,
 *  сохраняя все элементы в списке. Используйте итератор
 */
public class Main3 {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        int summ = 0;
        while(iterator.hasNext()){
            summ += iterator.next(); 
        }
        System.out.println(summ);
    }
}