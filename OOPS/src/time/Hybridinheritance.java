package time;
interface Walkable {
    void walk();
}

interface Swimmable {
    void swim();
}

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal implements Walkable {
    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

class Duck extends Animal implements Walkable, Swimmable {
    @Override
    public void walk() {
        System.out.println("Duck is walking.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    void quack() {
        System.out.println("Duck is quacking.");
    }
}

public class Hybridinheritance {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();

        System.out.println("---------------------");

        Fish fish = new Fish();
        fish.eat();
        fish.swim();

        System.out.println("---------------------");

        Duck duck = new Duck();
        duck.eat();
        duck.walk();
        duck.swim();
        duck.quack();
    }
}
