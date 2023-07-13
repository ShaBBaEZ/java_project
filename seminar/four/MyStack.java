package Java_project.seminar.four;

public class MyStack {
    String[] arr = new String[10];
    int size;

    int size(){//возвращает кол-во элементов в массиве
        return size;
    } 
    
    boolean empty(){
        return size == 0;
    } 
    
    void push(String item){
        if (size >= arr.length){
            String[] arr2 = new String[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);// копируем массив указывая из какого,с какого элемента, в какой массив с какого элемента и кол-во элементов какое необходимо переписать
            arr = arr2;// меняем ссылку на другой участок памяти то есть меняем первоначальный массив на новый.
        }
        arr[size++] = item;
    } 
    
    String peek(){// позволяет посмотреть последний элемент но не удаляет его
        if (empty()){// если пустой массив то возвращаем null
            return null;
        }
        return arr[size - 1];
    } 
    
    String pop(){// возвращает элемент и удаляет его из коллекции
        if (empty()){
            return null;
        }
        size--;
        return arr[size];
    }
}
