package Java_project.seminar.one;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
      /**
         * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
         * "Доброе утро, Имя ! если время от 05:00 до 11:59"
         * Добрый день если от 12 до 17:59
         * Добрый вечер если от 18 до 22:59
         * Доброй ночи если время от 23 до 4:59
         */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// Чтение консоли
        LocalTime time = LocalTime.now();// возвращает текущее значение времени на ПК 
        System.out.println("Как вас зовут?");// выводит на экран сообщение
        String name = scanner.nextLine();//Пользователь вводит имя
        int hour = time.getHour();// берём только часы из значение тайм
        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро, " + name + "!");
        }else if (hour >= 12 && hour < 18){
            System.out.println("Добрый день, " + name + "!");
        }else if (hour >=  18 && hour < 23){
            System.out.println("Добрый вечер, " + name + "!");
        }else {// всё оставшееся значение поэтому можно без пояснений
            System.out.println("Доброй ночи, " + name + "!");
        }
        scanner.close();
    }
}