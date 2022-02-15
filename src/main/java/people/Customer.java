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

    public void setMoney(double money) {
        this.money = money;
    }

    public int countCars() {
        return collection.size();
    }

    public void buyCar(Car car) {
        collection.add(car);
    }

    public void sellCar(Car car) {
        collection.remove(car);
    }
}
