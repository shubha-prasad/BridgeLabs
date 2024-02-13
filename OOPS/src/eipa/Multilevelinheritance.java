package eipa;
class Vehicle {
    void start() {
        System.out.println("Vehicle started.");
    }

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}


class   Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}

class SportsCar extends Car {
    void accelerate() {
        System.out.println("Sports car accelerating.");
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();

        System.out.println("---------------------");


        Car car = new Car();
        car.start();
        car.drive();
        car.stop();

        System.out.println("---------------------");


        SportsCar sportsCar = new SportsCar();

        sportsCar.start();
        sportsCar.drive();
        sportsCar.accelerate();
        sportsCar.stop();
    }
}
