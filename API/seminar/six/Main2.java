package Java_project.seminar.six;
/*
 * Продумайте структуру класса Кот, какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архиво выставки котов
 * в) информационной системой Театра кошек Куклачёва
 * Мужно записать в текстовом виде не обязательно реализовывать в java
 * 
 * 
 * Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы
 * создайте несколько экземпляров этого класса, выведите их в консоль
 * 
 * Добейтес того чтобы при выводе в консоль объекта типа Cat выводилась его кличка цвет и возраст
 * 
 * Создайте множество, в котором будут храниться экземпляры класса Cat-HashSet<Cat>
 * Поместите в него некоторое количество объектов
 * 
 * 2)Создайте 2 или более котов с одинковыми параметрами в полях. Поместите их во множество. Убедитесь что все они сохранились
 * 

 * Создайте метод public boolean equals(Object o)
 * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях
 * то есть метод должен возвращать тру если значения во всех полях сравниваемых объектов равны
 * 
 * выведите снова содержимое множества из пункта 2 убедитесь что дубликаты удалились
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();

        Cat cat1 = new Cat(121,"Васька", "Иван Петрович", 8, "Черный");
        Cat cat2 = new Cat(22,"Мурка", "Мария Ивановна", 9, "Рыжий");
        Cat cat3 = new Cat(564,"Барсик", "Иван Васильевич", 8, "Белый");
        Cat cat4 = new Cat(564,"Барсик", "Иван Васильевич", 8, "Белый");

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        
        // System.out.println(cat3.equals(cat4));// сравниваем объекты

        for (Cat cat: set){// перебор коллекции set для вывода 
            System.out.println(cat);
        }

        List<Cat> res = new ArrayList<>();// фильтрация для дз
        for (Cat cat: set){
            if (cat.age == 8){
                res.add(cat);
            }
        }

        for (Cat cat: res){
            System.out.println(cat);
        }

        // System.out.println(cat1);
        // System.out.println(cat2);
        // System.out.println(cat3);
    }
}
