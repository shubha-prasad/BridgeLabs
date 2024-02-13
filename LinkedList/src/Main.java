import time.DLL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DLL l=new DLL();
        l.add(10);
        l.add(20);
        l.display();
        l.insertFirst(30);
        l.display();
        l.display();
    }
}