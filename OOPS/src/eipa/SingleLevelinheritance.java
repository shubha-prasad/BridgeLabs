package eipa;
class Animal {
    void eat() {

        System.out.println("This animal eats food.");
    }

    void sleep() {

        System.out.println("This animal sleeps.");
    }
}
class Dog extends Animal {
    void bark() {

        System.out.println("The dog barks.");
    }
}
public class SingleLevelinheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println("---------------------");
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}

