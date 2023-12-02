public class Vehicle {
    private String make;
    private String plate;
    private String color;
    private VehicleCategory category;

    public Vehicle(String make, String plate, String color, VehicleCategory category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    @Override
    public String toString() {
        return "- Vehicle make :" + make + "\n - Plate :" + plate + "\n - Color :" + color + "\n - Category :" + category;
    }
}
