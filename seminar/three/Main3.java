package Java_project.seminar.three;
/*
 * Каталог товаров книжного магазина сохранен в виде дмуверного списка List<ArrayList<String>>
 * так что на 0-й позиции каждого внутреннего списка содержится название жанра, а на остальных позиция -названия книг
 * напишите метод для заполнения данной структуры.
 */

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<List<String>> shopBook = new ArrayList<>();
        addBook((shopBook), "сказки", "колобок");
        addBook((shopBook), "фантастика", "гарри поттер");
        addBook((shopBook), "фантастика", "гарри поттер");
        addBook((shopBook), "сказки", "курочка ряба");
        addBook((shopBook), "роман", "война и мир");
        addBook((shopBook), "роман", "ромео и джульетта");
        addBook((shopBook), "фантастика", "ночной дозор");
        addBook((shopBook), "сказки", "Золотой петушок");

        System.out.println(shopBook);
    }

    static void addBook(List<List<String>> shopBook, String genreBook, String nameBook){
        for (int i = 0; i < shopBook.size(); i++) {
            List<String> genreList = shopBook.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)){
                if (!genreList.contains(nameBook)){// возвращает тру если уже есть и поставили отрицание
                    genreList.add(nameBook);// в этот же массив кладём название
                }   
                return; 
            }
        }

        List<String> list = new ArrayList<>();
        list.add(genreBook);
        list.add(nameBook);
        shopBook.add(list);
    }
}
