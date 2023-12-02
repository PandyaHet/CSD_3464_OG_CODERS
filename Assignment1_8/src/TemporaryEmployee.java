public class TemporaryEmployee extends Contract {
    private double hourlyWages;
    private int hoursWorked;

    // Constructor
    public TemporaryEmployee(double hourlyWages,int hoursWorked) {

        this.hourlyWages = hourlyWages;
        this.hoursWorked = hoursWorked;
    }

    // Method to calculate accumulated salary for a temporary employee
    public double accumulatedSalary() {
        return hoursWorked * hourlyWages;
    }

    public void convertFrom(double accumulatedSalary){

    }

    // Overriding toString for better representation
    @Override
    public String toString() {
        return " He/She is a temporary employee with " + hourlyWages + " Hourly salary and he/she has worked for " + hoursWorked+" hours.\n";
    }
}
