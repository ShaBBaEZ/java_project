package java_project.seminar.two;


public class Main {
    /*
     * Дано четное число N > 0 и символы c1 и c2/
     * Написать метод, который вернёт строку длинны N, которая состоит из чередующихся символов c1 и c2 начиная с с1
     * Ответ с1с2с1с2(всего N символов)
     */
    public static void main (String[] args){
        char c1 = 'a';// char хранит только 1 символ и только тут используются одиночные ковычки
        char c2 = 'b';
        int n = 6;
        System.out.println(alternation(c1, c2, n));
    }
    static String alternation (char c1, char c2, int n){
        StringBuilder alt = new StringBuilder();
        for (int i = 0; i < n / 2; i++){
            alt.append(c1);
            alt.append(c2);
        } 
        return alt.toString();//преобразует в строку    
    }
}

