package example;
abstract class Shape {
}
interface Colorable {
    void setColor(String color);
}

class Circle extends Shape implements Colorable {
    private String color;

    void draw() {
        System.out.println("Drawing a circle");
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Setting circle color to: " + color);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.draw();
        circle.setColor("Red");
    }
}
