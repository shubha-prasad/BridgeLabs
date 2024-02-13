package set;

public interface DemoInterface
{
    void demo();
    void demo1();

    default void display(){
        System.out.println("Hello default");
    }

}


class A implements DemoInterface{
    public void demo(){
        System.out.println("Demo method");
    }


    public void demo1() {
        System.out.println("Demo1 method");
    }

}


