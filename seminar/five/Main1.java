package Java_project.seminar.five;
/*
 * Даны 2 строки написать метод который вернёт тру если строки являются изоморфными и фалсе если нет
 * Строки изоморфны если в одну букву в первом слове можно зменить на некоторую букву во втором слове при этом
 * повторяюзиеся буквы одного слома меняются на одну и ту же букву с сохранением порядка следования
 * Например add egg изоморфны
 * буква может не меняться а остаться такой же Например note - code
 * Пример 1:
 * foo bar
 * false
 * пример 2:
 * paper title
 * true
 */

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        String s1 = "title";
        String s2 = "pater";

        System.out.println(isIsomorphic(s1,s2));
    }

    static boolean isIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])){//проверяем ключи
                if(c2[i] != map.get(c1[i])){
                    return false;
                } else {
                    // if (map.containsValue(c2[i])){// проверяем чтобы значения не повторялись во втором слове
                    //     return false;
                    // }
                    map.put(c1[i], c2[i]);//кладём ключ из c1 значение с2
                }
            }
        }
        return true;
    }
}
