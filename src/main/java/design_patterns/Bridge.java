package design_patterns;

public class Bridge {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Audi());
        vehicle.drive();
        Vehicle vehicle1 = new Car (new Toyota());
        vehicle1.drive();
        Vehicle vehicle2 = new Truck (new Audi());
        vehicle2.drive();
    }
}

abstract class Vehicle {

    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

class Car extends Vehicle {

    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive car ");
    }
}

class Truck extends Vehicle {
    public Truck(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive truck ");
    }
}

interface Model {
    void drive (String str);
}

class Audi implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "audi");
    }
}

class Toyota implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + "toyota");
    }
}
