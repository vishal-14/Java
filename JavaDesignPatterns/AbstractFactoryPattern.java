package com.designpattern;

/**
 * 3.Implement Abstract Factory Pattern to create cars of
 * different categories from different countries.
 */
enum Car_type{
    CONVERTIBLE, SPORTS, LUXURY;
}
enum Location{
    INDIA, JAPAN;
}

abstract class Car{
    Car_type car;
    Location location;
    public Car(Car_type car, Location location) {
        this.car = car;
        this.location = location;
    }
    abstract void build_car();
}

class Convertible_car extends Car {
    public Convertible_car( Location location) {
        super(Car_type.CONVERTIBLE, location);
    }
    @Override
    void build_car() {
        System.out.println("Assembling Convertible car");
    }

    @Override
    public String toString() {
        return "Convertible_car{" +
                "car=" + car +
                ", location=" + location +
                '}';
    }
}

class Sports_car extends Car {
    public Sports_car( Location location) {
        super(Car_type.SPORTS, location);
    }
    @Override
    void build_car() {
        System.out.println("Assembling Sports car");
    }

    @Override
    public String toString() {
        return "Sports_car{" +
                "car=" + car +
                ", location=" + location +
                '}';
    }
}

class Luxury_car extends Car {
    public Luxury_car( Location location) {
        super(Car_type.LUXURY, location);
    }
    @Override
    void build_car() {
        System.out.println("Assembling Luxury car");
    }

    @Override
    public String toString() {
        return "Luxury_car{" +
                "car=" + car +
                ", location=" + location +
                '}';
    }
}

class IndianCarFactory {
    static Car get_car(Car_type type) {
        Car car = null;
        switch (type) {
            case CONVERTIBLE:
                car = new Convertible_car(Location.INDIA);
                car.build_car();
                break;
            case SPORTS:
                car = new Sports_car(Location.INDIA);
                car.build_car();
                break;
            case LUXURY:
                car = new Luxury_car(Location.INDIA);
                car.build_car();
                break;
        }
        return car;
    }

}

class JapanCarFactory {
    static Car get_car(Car_type type) {
        Car car = null;
        switch (type) {
            case CONVERTIBLE:
                car = new Convertible_car(Location.JAPAN);
                car.build_car();
                break;
            case SPORTS:
                car = new Sports_car(Location.JAPAN);
                car.build_car();
                break;
            case LUXURY:
                car = new Luxury_car(Location.JAPAN);
                car.build_car();
                break;
        }
        return car;
    }

}

class Car_factory {
    static Car get_car(Car_type carType, Location location) {
        Car car = null;
        switch (location) {
            case INDIA:
                car = IndianCarFactory.get_car(carType);
                break;
            case JAPAN:
                car = JapanCarFactory.get_car(carType);
                break;
        }
        return car;
    }
}

public class AbstractFactoryPattern {
    public static void main(String[] args) {

        System.out.println(Car_factory.get_car(Car_type.LUXURY,Location.INDIA));
        System.out.println(Car_factory.get_car(Car_type.SPORTS,Location.JAPAN));

    }
}
