package Java_project.seminar.five;
/*
 * Написать программу определяющую правильность расстановки скобок в выражении
 * Пример 1 a+(d*3) истина
 * [a +(1]*3) ложь
 * [6+(3*3)] истина
 * {a}[+]{(d*3)} истина
 * <{a}+{(d*3)}> истина
 * {a+]}{(d*3)} ложь
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        String s = "{a+]}{(d*3)}";
        System.out.println(check(s));
    }

    static boolean check (String s) {
        Stack<Character> stack = new Stack<>();
        char[] c1 = s.toCharArray();// разбиваем строку на массив чаров содержаших 1 символ
        Map<Character,Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){// проверяем есть ли такой ключ и добавляем 
                stack.push(c1[i]);
            }
            if (map.containsValue(c1[i])){
                if (stack.isEmpty() || map.get(stack.pop()) != c1[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
