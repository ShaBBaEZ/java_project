package Java_project.seminar.five;
import java.util.HashMap;
import java.util.Map;

public class Passports {
    Map<String, String> passports = new HashMap<>();

    void addNote(String num, String name){//медот для добавления новой записи в коллекцию, передаём туда ключ и значение
        passports.put(num, name);
    }

    String findByName(String lastName){// метод для вывода записи по имени
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: passports.entrySet()){//Map.Entry - объект который содержит две переменные ключ и значение
            String num = entry.getKey();
            String name = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(num);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
