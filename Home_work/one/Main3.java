package Java_project.Home_work.one;

import java.util.Scanner;

/*
 * Реализовать простой калькулятор
 */
public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите действие где: Сложение = 1; Вычитаение = 2; Умножение = 3; Деление = 4");
        int action = scanner.nextInt();
        if(action == 1){
            System.out.println(number1 + number2);
        }else if(action == 2){
            System.out.println(number1 - number2);
        }else if(action == 3){
            System.out.println(number1 * number2);
        }else if(action == 4){
            System.out.println(number1 / number2);
        }else{
            System.out.println("Нет такого действия");
        }
    } 
}
