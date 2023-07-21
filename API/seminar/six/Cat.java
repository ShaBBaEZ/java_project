package Java_project.seminar.six;

public class Cat {
    //a) информционной системой ветеринарной клиники
    int numPassport;
    String owner;
    String name;
    int age;// лучше дату рождения а не возраст указывать и потом высчитывать возраст через метод
    String color;

    public Cat(int numPassport, String name, String owner, int age, String color){
        this.numPassport = numPassport;
        this.owner = owner;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int HashCode() {
        return name.hashCode() + 7 * numPassport + 13 * owner.hashCode();// умножение делается для того чтобы было меньше совпадений
    }
    
    public String toString(){
        return "numPassports: " + numPassport + ", owner: " + owner + ", name: " + name + ", age: " + age + ", color: " + color;
    }

    // public boolean equals(Object obj){// метод для сравнения
    //     if (this == obj){
    //         return true;
    //     }
    //     if(!(obj instanceof Cat)){// проверяем входит ли наш объект в класс Cat если нет то нет смысла сравнивать но HashCode всё равно будет разный и приложение будет считать что это разные объекты
    //         return false;
    //     }
    //     Cat cat = (Cat) obj;
    //     return numPassport == cat.numPassport && name.equalsIgnoreCase(cat.name) && owner.equalsIgnoreCase(cat.owner); // можно так же добавить и 
    // }
}
