package work;
interface Walkable {
    void walk();
}

interface Flyable {
    void fly();
}

class Animal {
    void eat() {

        System.out.println("Animal is eating.");

    }
}

class Bird extends Animal implements Walkable, Flyable {
    @Override
    public void walk() {
        
        System.out.println("Bird is walking.");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    void chirp() {
        System.out.println("Bird is chirping.");
    }
}

public class Multipleinheritance {
    public static void main(String[] args) {
        // Creating an instance of Bird

        Bird bird = new Bird();
        bird.eat();
        bird.walk();
        bird.fly();
        bird.chirp();

    }
}
