package Java_project.seminar.five;
/*
 * создать структуру для хранения номеров паспортов и фамилий сотруднкиов
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов
 */

public class Main {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.addNote("123456", "Иванов");
        passports.addNote("321456", "Васильев");
        passports.addNote("234561", "Петрова");
        passports.addNote("234432", "Иванов");
        passports.addNote("654321", "Петрова");
        passports.addNote("345678", "Иванов");

        System.out.println(passports.findByName("Иванов"));
        
    }
}
