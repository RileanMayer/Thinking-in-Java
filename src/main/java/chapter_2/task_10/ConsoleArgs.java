package chapter_2.task_10;

public class ConsoleArgs {
    public static void main(String[] args) {
        for(String s : args) {
            System.out.println("Console parameter = " + s);
        }
    }
}
