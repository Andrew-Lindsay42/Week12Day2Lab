package places;

import vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private double till;
    private ArrayList<Car> cars;

    public Dealership(String name, double till, ArrayList<Car> cars) {
        this.name = name;
        this.till = till;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public int countCars() {
        return cars.size();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void sellCar(Car car) {
        cars.remove(car);
    }
}
