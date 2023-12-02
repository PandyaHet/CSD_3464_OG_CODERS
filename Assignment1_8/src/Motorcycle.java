public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String plate, String color, VehicleCategory category, boolean hasSidecar) {
        super(make, plate, color, category);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return "Employee has a Motorcycle \n - hasSidecar :" + hasSidecar + "\n " + super.toString();
    }
}
