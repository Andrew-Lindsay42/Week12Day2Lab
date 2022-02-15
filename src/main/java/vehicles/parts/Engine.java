package vehicles.parts;

public class Engine {
    private double size;
    private int horsepower;

    public Engine(double size, int horsepower) {
        this.size = size;
        this.horsepower = horsepower;
    }

    public double getSize() {
        return size;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String start() {
        return "Vroom!";
    }

    public String stop() {
        return "---";
    }
}
