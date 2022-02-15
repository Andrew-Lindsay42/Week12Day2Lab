package people;

import vehicles.Car;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double money;
    private ArrayList<Car> collection;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public void increaseMoney(double amount) {
        this.money += amount;
    }

    public void decreaseMoney(double amount) {
        this.money -= amount;
    }

    public int countCars() {
        return collection.size();
    }

    public boolean canAfford(Car car){
        return getMoney() >= car.getPrice();
    }

    public void buyCar(Car car) {
        collection.add(car);
        decreaseMoney(car.getPrice());
    }

    public void sellCar(Car car) {
        collection.remove(car);
        increaseMoney(car.getPrice());
    }
}
