package vehicles;

import vehicles.parts.Engine;
import vehicles.parts.SteeringWheel;
import vehicles.parts.Wheels;

public class Car {

    private String make;
    private String model;
    private double price;
    private String colour;
    private Engine engine;
    private Wheels wheels;
    private SteeringWheel steeringWheel;
    private int seats;
    private CarType carType;
    private double damage;

    public Car(String make, String model, double price, String colour, Engine engine, Wheels wheels, SteeringWheel steeringWheel, int seats, CarType carType) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
        this.seats = seats;
        this.carType = carType;
        this.damage = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price - damage;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public int getSeats() {
        return seats;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public String drive(){
        return String.format("%s %s Neeeoowww", engine.start(), steeringWheel.tootHorn());
    }

    public double getDamage() {
        return damage;
    }

    public void increaseDamage(double d) {
        damage += d;
    }

    public void repairDamage(double d) {
        if (damage >= d) {
            damage -= d;
        } else {
            damage = 0;
        }
    }
}
