package Java_project.Home_work.one;

import java.util.Scanner;

/*
 *  Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n-ое число");
        int n = scanner.nextInt();
        System.out.println("Сумма чисел от 1 до " + n + " равна " + summ(n));
        System.out.println("Произведение чисел от 1 до " + n + " равно " + product(n));
    }
    static int summ(int x){
        int summ = 0;
        for (int i = 1; i <= x; i++) {
            summ += i;
        }
        return summ;
    }
    static int product(int x){
        int product = 1;
        for (int i = 1; i <= x; i++) {
            product *= i;
        }
        return product;
    }
}
