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

import java.util.HashSet;
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
        System.out.println("3.Выход.");
    }

    public static void start(Set<Notebook> set){
        int key = 0;
        while(key != 3){
        printmenu();
        System.out.println("Введите пункт меню: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
            switch(key) {   
            case 1:
                allNotebook(set);
                start(set);
            case 2:
                filter(set);;
            case 3:
                break;
            default:
                System.out.println("\n\n\nВы ввели неправильное значение\n\n\n");
                break;
            }
        }
    }

    public static void allNotebook (Set<Notebook> set){// метод вывода ноутбуков так же выводит отфильтрованные
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
        System.out.println("8.Сбросить фильтр");
        System.out.println("9.Показать ноутбуки по фильтру");
        System.out.println("10.Назад");
    }
    public static void filter(Set<Notebook> set){
        Set<Notebook> filterSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int key = 0;
        while(key != 10){
        filterMenu();
        System.out.println("Введите пункт меню: ");
        key = scanner.nextInt();
        switch(key){
            case 1:

                break;
            case 2:
                break;
            case 3: 
                break;
            case 4:  
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                int min = 0;
                int max = 9999999;
                System.out.println("Введите минимальное значение или поставьте 0 если фильтр не нужен: ");
                int a = scanner.nextInt();
                System.out.println("Введите максимальное значение или поставьте 0 если фильтр не нужен : ");
                int b = scanner.nextInt();
                if(a != 0){
                    min = a;
                }
                if(b != 0){
                    max = b;
                }
                if (filterSet.size() == 0){
                    for (Notebook notebook: set){
                        if (notebook.price > min && notebook.price < max){
                            filterSet.add(notebook);
                            }
                        }
                    }
                for (Notebook notebook: filterSet){
                    if (notebook.price > min && notebook.price < max){
                        filterSet.add(notebook);
                        }
                }   
                break; 
            case 8:
                filterSet.clear();
                System.out.println("\n\n\nФильтр сброшен\n\n\n");
                break;
            case 9:
                allNotebook(filterSet);
                break;
            case 10:
                start(set);
                break;
            default:
                System.out.println("\n\n\nВы ввели неправильное значение\n\n\n");
            }
        }
    }
}