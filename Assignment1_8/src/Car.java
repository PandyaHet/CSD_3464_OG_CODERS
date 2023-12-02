public class Car extends Vehicle{
    private GearType gear;
    private CarType type;

    public Car(String make, String plate, String color, VehicleCategory category, GearType gear, CarType type) {
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee has a Car \n  - Gear :" + gear + "\n - Type :" + type + "\n " + super.toString();
    }
}
