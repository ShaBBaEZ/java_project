package Java_project.seminar.three;
/*
 * Даны следующие строки, сравнить их с помощью == и метода equals() класса object
 */
public class Main {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l"+ "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});
        
    }
    
}
