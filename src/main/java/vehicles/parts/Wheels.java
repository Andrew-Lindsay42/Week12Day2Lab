package vehicles.parts;

public class Wheels {
    private String tyreManufacturer;
    private int size;

    public Wheels(String tyreManufacturer, int size) {
        this.tyreManufacturer = tyreManufacturer;
        this.size = size;
    }

    public String getTyreManufacturer() {
        return tyreManufacturer;
    }

    public void setTyreManufacturer(String tyreManufacturer) {
        this.tyreManufacturer = tyreManufacturer;
    }

    public int getSize() {
        return size;
    }
}
