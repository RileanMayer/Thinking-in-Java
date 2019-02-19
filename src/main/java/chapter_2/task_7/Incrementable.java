package chapter_2.task_7;

public class Incrementable {
    static int i ;

    static void increment() {
        i++;
    }

    public static void main(String[] args) {
        Incrementable.increment();
        System.out.println(Incrementable.i);
    }
}
