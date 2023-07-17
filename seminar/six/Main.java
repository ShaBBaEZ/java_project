package Java_project.seminar.six;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Создать Hashset заполнить его числами {1,2,3,2,4,5,6,3}
 * распечатайте содержимое данного множества
 * LinkedHashSet
 * Tree set
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{3,1,2,2,4,5,6,3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
