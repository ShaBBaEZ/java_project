package java_project.seminar.four;
/*
 * Реализовать стэк с помощью массива
 * нужно реализовать методы
 * size() empty() push() peek() pop()
 */

public class Main4 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.size);
        stack.push("3");
        stack.push("4");
        System.out.println(stack.size);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    } 
}

