package Java_project.Home_work.six;

public class Notebook {
    String brand;
    String name;
    int serialNumber;
    String processor;
    String videoCard;
    int ram;
    int volumeHDD;
    String os;
    int price;

public Notebook(String brand, String name, int serialNumberm, String processor, String videoCard, int ram, int volumeHDD, String os, int price){
    this.brand = brand;
    this.name = name;
    this.serialNumber = serialNumberm;
    this.processor = processor;
    this.videoCard = videoCard;
    this.ram = ram;
    this.volumeHDD = volumeHDD;
    this.os = os;
    this.price = price;
}


public String toString(){
        return "brand: " + brand + ", name: " + name + ", serialNumber: " + serialNumber + ", processor: " + processor + ", videoCard: "+ videoCard + ", ram: " + ram + ", VolumeHDD: " + volumeHDD + ", os: " + os + ", price: " + price;
    }


    
}