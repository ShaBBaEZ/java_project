package java_project.seminar.two;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Main3 {
    /*
     * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
     * и метод который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    public static void main(String[] args){
        int n = 100;
        String s = "TEST";
        String s1 = duplicate(s,n);
        String filePath = "Java_project/seminar/two/test.txt";// создаём файл по указанному пути
        writeToFile(s1, filePath);
        System.out.println(readInFile(filePath));
    }
    static String readInFile(String filePath){// метод для чтения файла в консоли
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static void writeToFile(String s1, String filePath) {// метод для записи чего либо в файл
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("Java_project/seminar/two/log.txt");
            logger.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            FileWriter writer = new FileWriter(filePath);// можно добавить в скобку true и тогда будет записывать дальше а не перезаписывать.
            writer.write(s1);//запись
            writer.flush();// делает запись именно в файл из буфера write
            writer.close();// закрытие файла
            logger.info("Запись успешно выполнена");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Не удалось записать в файл");
            }
        
        }

    static String duplicate(String s, int n) {
        return s.repeat(n);// Метод repeat() конструирует и возвращает новую строку, содержащую указанное количество соединённых вместе копий строки, на которой он был вызван.
    }
}
