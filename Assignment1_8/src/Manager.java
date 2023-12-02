public class Manager extends Employee{
    private int traveledDays;
    private int newClients;

    private Vehicle vehicle;


    public Manager(String name, int birthYear, int newClients,int traveledDays, double occupationRate) {
        super(name, birthYear, occupationRate,EmployeeType.Manager,null);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }
    public Manager(String name, int birthYear, int newClients,int traveledDays, double occupationRate,Vehicle vehicle) {
        super(name, birthYear, occupationRate,EmployeeType.Manager,vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
        this.vehicle = vehicle;
    }

    public Manager(String name, int birthYear, int newClients,int traveledDays) {
        super(name, birthYear, 0,EmployeeType.Manager, null);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
    }

    public Manager(String name, int birthYear, int newClients,int traveledDays,Vehicle vehicle) {
        super(name, birthYear, 0,EmployeeType.Manager,vehicle);
        this.traveledDays = traveledDays;
        this.newClients = newClients;
        this.vehicle = vehicle;
    }
    public int getTraveledDays() {
        return traveledDays;
    }

    public int getNewClients() {
        return newClients;
    }

    @Override
    public String toString() {
//        return super.toString() + "\n - TraveledDays :" + traveledDays + "\n - NewClients :" + newClients +"\n"+ vehicle.toString();
        return super.toString() + " He/She travelled " + traveledDays + " days and has brought " + newClients +" new clients.";

    }
}
