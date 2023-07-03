package java_project.Home_work.two;
/*
 * Дана json строка вида:
String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
"{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
"{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

Задача написать метод(ы), который распарсить строку и выдаст ответ вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

Используйте StringBuilder для подготовки ответа. Далее создайте метод, который запишет
результат работы в файл. Обработайте исключения и запишите ошибки в лог файл с помощью Logger.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                      "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                      "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        json = deliverance(json);
        String filePath = "java_project/Home_work/two/text.txt";
        writeToFile(json, filePath);

                    
    }

    static String deliverance(String json) {//избавление от лишних символов и преобразование строки в нужную нам.
        json = json.replaceAll("[^A-Za-z0-9-А-Я-а-я}]", "");
        json = json.replaceAll("}", "\n");
        json = json.replaceAll("фамилия", "Студент ");
        json = json.replaceAll("оценка", " получил ");
        json = json.replaceAll("предмет", " по предмету ");
        return json;
    }
    // static String bulder(String[] array){ // не получилось реализовать через stringbulder
    //     StringBuilder stringBuilder = new StringBuilder();
    //     for (int i = 0; i < array.length; i++) {
    //         stringBuilder.append(array[i] +" ");
    //     }
    //     return stringBuilder.toString();
    // }

    /**
     * @param json
     * @param filePath
     */
    static void writeToFile(String json, String filePath){
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("java_project/Home_work/two/log.txt");
            logger.addHandler(fileHandler);
        } catch (SecurityException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try{
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.flush();
            writer.close();
            logger.info("Запись сделана");
        } catch (Exception e){
            e.printStackTrace();
            logger.warning("Запись не сделана");
            }
        // fileHandler.close(); почему то не закрывается
    }
}
