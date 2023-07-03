package java_project.Home_work.one;

/*
 * Вывести все простые числа от 1 до 1000
 */
public class Main2 {
    public static void main(String[] args){// если начинать i с 1 то он её тоже печатает, но учёные так и не договорились простое это число или нет.
        for (int i = 2; i <= 1000; i++) {
            if(simple(i) == 1){
                System.out.println(i);
            }
        }
    }
    static int simple(int x){// хотела чтобы возвращалось True or False как то не получилось static boolean simple(inx x) подчёркивалось как будто не хотел принимать число.
        if (x == 2){
            return 1; 
        }
        if (x % 2 == 0){
            return 2;
        }
        for (int i = 3; i <= x / 2 + 1; i+= 2) {
            if (x % i == 0){
                return 2;
            }
        }
        return 1;
    }
}
