package Java_project.Home_work.four;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<Object> queue = new LinkedList<>();
    /**
     * помещает элемент в конец очереди
     */
    Queue<Object> enqueue(Object item){
        queue.add(item);
        return queue;
    }
    /**
     * - возвращает первый элемент из очереди и удаляет его,
     */
    Queue<Object>dequeue(){
        queue.poll();
        return queue;
    } 
    /**
     *  - возвращает первый элемент из очереди, не удаляя.
     */
    Queue<Object>first(){
        queue.peek();
        return queue;
    }
}
