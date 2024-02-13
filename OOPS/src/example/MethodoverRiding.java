package example;
class Animal {
    void makeSound() {

        System.out.println("Generic animal sound");

    }
}
class Dog extends Animal {
    @Override

    void makeSound() {

        System.out.println("Bark! Bark!");

    }
}

class Cat extends Animal {
    @Override

    void makeSound() {

        System.out.println("Meow!");

    }
}

public class MethodoverRiding {

    public static void main(String[] args) {

        Animal genericAnimal = new Animal();

        genericAnimal.makeSound();

        System.out.println("---------------------");

        Dog myDog = new Dog();

        myDog.makeSound();

        System.out.println("---------------------");

        Cat myCat = new Cat();

        myCat.makeSound();

    }
}

