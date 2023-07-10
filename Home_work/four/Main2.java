package java_project.Home_work.four;
/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Main2 {
    public static void main(String[] args) {
        MyQueue qu = new MyQueue();
        qu.enqueue("1");
        qu.enqueue("2");
        qu.enqueue("3");
        qu.enqueue("4");
        System.out.println(qu);
    }
    
}
