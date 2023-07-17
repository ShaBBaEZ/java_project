package Java_project.Home_work.six;
/*
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;




public class Main {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        Notebook notebook1 = new Notebook("Acer", "Nitro 5", 665321 , "Ryzen 5 4600H","GTX 1650", 16 , 512, "без ОС", 66999);
        Notebook notebook2 = new Notebook("ASUS","ROG Strix G15", 123123 , "Ryzen 9 6900HX","RTX 3070", 32 , 1024, "Windows 10", 145999);
        Notebook notebook3 = new Notebook("MSI","Vector GP77", 321321 , "Intel Core i7-13700H","RTX 4070", 16 , 1024, "Ubuntu", 174999);
        Notebook notebook4 = new Notebook("MSI","GF76 Katana", 456789 , "Intel Core i7-12650H","RTX 4060", 16 , 512, "Windows 11", 113999);
        Notebook notebook5 = new Notebook("ASUS","ROG Strix G15", 789456 , "Ryzen 7 6800H","RTX 3060", 16 , 1024, "Debian", 109499);
        Notebook notebook6 = new Notebook("Apple","MacBook Air", 789789 , "Apple M2","Apple M2-8core", 8 , 256, "macOS", 123499);
        Notebook notebook7 = new Notebook("ASUS","TUF Gaming", 456456 , "Intel Core i7-12700H","GeForce RTX 4060", 16 , 512, "Windows 10", 134999);
        Notebook notebook8 = new Notebook("MSI","Crosshair", 147147 , "Intel Core i7-12650H","RTX 4070", 16 , 1024, "Windows 11", 134999);
        Notebook notebook9 = new Notebook("ASUS","ROG Strix", 852852 , "Intel Core i5-13450HX","RTX 4060", 16 , 1024, "Debian", 149999);
        Notebook notebook10 = new Notebook("Apple","MacBook Air", 963963 , "Apple M1","Apple M1 7-core", 8 , 256, "macOS", 97499);
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        set.add(notebook7);
        set.add(notebook8);
        set.add(notebook9);
        set.add(notebook10);
        start(set);
    }


    public static void printmenu(){// Основное меню
        System.out.println("1.Вывести список всех ноутбуков с характеристиками.");
        System.out.println("2.Выбрать фильтры для ноутбука.");
        System.out.println("3.Вывод ноутбуков по фильтру.");
        System.out.println("4.Сбросить фильтр.");
        System.out.println("5.Выход.");
    }

    public static void start(Set<Notebook> set){
        printmenu();
        System.out.println("Введите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        switch(key) {
            case 1:
                allNotebook(set);
                start(set);
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            default:
                System.out.println("Вы вввели неправильное значение меню \n");
                start(set);
        }
       
    }

    public static void allNotebook (Set<Notebook> set){// метод вывода всех ноутбуков case 1
        for (Notebook notebook: set){
            System.out.println(notebook);
        }
    } 

    public static void filterMenu(){// меню фильтра 
        System.out.println("1.Фильтр по бренду");
        System.out.println("2.Фильтр по процессору");
        System.out.println("3.Фильтр по видеокарте");
        System.out.println("4.Фильтр по ОЗУ");
        System.out.println("5.Фильтр по объёму HDD");
        System.out.println("6.Фильтр по ОС");
        System.out.println("7.Фильтр по стоимости");
        System.out.println("8.Назад");
    }
    public static void filter(Set<Notebook> set){
        filterMenu();
        System.out.println("Введите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        switch(key){
            case 1:
                Map<Integer,String> map = new HashMap<>();
                Integer i = 1;
                for (Notebook notebook: set){
                    map.add(i, );
                    i++;
                }
                
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                printmenu();
            default:
                System.out.println("Вы вввели неправильное значение меню \n");
                filterMenu();
        }
    }
}
