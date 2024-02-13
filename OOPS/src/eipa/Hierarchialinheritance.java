package eipa;
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Hierarchialinheritance {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        System.out.println("---------------------");

        Circle circle = new Circle();

        circle.draw();

        circle.drawCircle();

        System.out.println("---------------------");

        Rectangle rectangle = new Rectangle();

        rectangle.draw();

        rectangle.drawRectangle();
    }
}

