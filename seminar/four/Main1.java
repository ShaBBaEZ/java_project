package Java_project.seminar.four;
/*
 * Написато консольное приложение которое принимает от пользователя строку виды
 * text~num
 * нужно рассплитить строку по ~ сохранить text в связный список на позицию num
 * Если введено print~num выводит строку из позиции num в связном списке и удаляет её из списка
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work){
            String line = scanner.nextLine();
            String[] arr = line.split("~");// создаём массив и сплитим по символу ~
            String text = arr[0];
            String numString = arr[1];
            int num = Integer.parseInt(numString);// преобразуем строку numString в число 
            if (num > list.size() || num < 0){
                System.out.println("Индекс за пределами.Операция невозможна");
                continue;
            }
            switch (text){
                case "print":
                    if (num == list.size()){
                        System.out.println("Индекс за пределами.Операция невозможна");
                        continue;
                    }
                    System.out.println(list.remove(num));
                    break;
                case "end":
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
}
