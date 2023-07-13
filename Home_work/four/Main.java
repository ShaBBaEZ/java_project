package Java_project.Home_work.four;
/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список. 
 * Постараться не обращаться к листу по индексам.
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        reversLL(list);
    }

    static void reversLL(LinkedList<Object> list) {
        LinkedList<Object> list2 = new LinkedList<>();
        while(list.size() > 0){
            list2.addFirst(list.getFirst());
            list.removeFirst();
        }
        list = list2;
        System.out.println(list);
    } 
}
