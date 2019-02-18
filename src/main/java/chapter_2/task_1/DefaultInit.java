package chapter_2.task_1;

public class DefaultInit {
    int anInt;
    char aChar;

    public static void main(String[] args) {
        DefaultInit defaultInit = new DefaultInit();
        System.out.println("Default int initialization: anInt = " + defaultInit.anInt);
        System.out.println("Default char initialization: aChar = " + defaultInit.aChar);
    }
}
