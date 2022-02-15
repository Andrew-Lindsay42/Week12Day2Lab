package places;

import people.Customer;
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

    public void increaseTill(double amount) {
        this.till += amount;
    }

    public void decreaseTill(double amount) {
        this.till -= amount;
    }

    public void addCar(Car car) {
        cars.add(car);
        decreaseTill(car.getPrice());
    }

    public void sellCar(Car car) {
        cars.remove(car);
        increaseTill(car.getPrice());
    }

    public String sellToCustomer(Customer customer, Car car){
        if (customer.canAfford(car)) {
            sellCar(car);
            customer.buyCar(car);
            return "Nice doing business with you";
        }
        return "Come back with more money";
    }

    public void repair(Car car, double repairValue) {
        decreaseTill(car.repairDamage(repairValue));
    }
}
