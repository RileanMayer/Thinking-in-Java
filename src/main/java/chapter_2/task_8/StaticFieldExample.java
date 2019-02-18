package chapter_2.task_8;

public class StaticFieldExample {
    static String s = "I'm single for all objects of this class!";

    public static void main(String[] args) {
        StaticFieldExample staticFieldExample = new StaticFieldExample();
        StaticFieldExample staticFieldExample1 = new StaticFieldExample();
        StaticFieldExample staticFieldExample2 = new StaticFieldExample();
        StaticFieldExample staticFieldExample3 = new StaticFieldExample();

        System.out.println(staticFieldExample.s);
        System.out.println(staticFieldExample1.s);

        StaticFieldExample.s = "Yeah! It's true!";

        System.out.println(staticFieldExample2.s);
        System.out.println(staticFieldExample3.s);
    }
}
