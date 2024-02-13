package time;

import static time.Methodoverloading.test;

public class Methodoverloading {
    public static void main(String[] args) {
        test();
    }
    public static void test(int a, int b){

        System.out.println("hi");
    }
    public static void test()
    {
        System.out.println("bye");
    }
    public static void test(int a)
    {
        System.out.println("good bye");
    }
}
