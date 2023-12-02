import java.util.Calendar;
import java.util.Enumeration;

public class Employee {
    private String name;
    private int birthYear;
    private double monthlyIncome;
    private double occupationRate;

    private EmployeeType employee;
//    private Contract contract;


    private static final double GAIN_FACTOR_CLIENT = 500;
    private static final double GAIN_FACTOR_TRAVEL = 100;
    private static final double GAIN_FACTOR_ERROR = 10;
    private static final double GAIN_FACTOR_PROJECTS = 200;
    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        setOccupationRate(occupationRate);
        System.out.println("We have a new employee: " + this);
    }

    public Employee(String name, int birthYear, double occupationRate) {
        this.name = name;
        this.birthYear = birthYear;
        setOccupationRate(occupationRate);
        System.out.println("We have a new employee: " + this);
    }
    public Employee(String name, int birthYear, double occupationRate,EmployeeType employee) {
        this.name = name;
        this.birthYear = birthYear;
        setOccupationRate(occupationRate);
        this.employee = employee;
        System.out.println("We have a new employee: " + name +" a,"+employee);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    public double getAnnualIncome() {
        if (this instanceof Manager) {
            Manager manager = (Manager) this;
            return   (manager.getNewClients() * GAIN_FACTOR_CLIENT) +
                    (manager.getTraveledDays() * GAIN_FACTOR_TRAVEL);
        } else if (this instanceof Tester) {
            Tester tester = (Tester) this;
            return (tester.getBugsSolved() * GAIN_FACTOR_ERROR);
        } else if (this instanceof Programmer) {
            Programmer programmer = (Programmer) this;
            return (programmer.getProjectsCompleted() * GAIN_FACTOR_PROJECTS);
        } else {
            return 0;
        }
    }

    public double getOccupationRate() {
        return occupationRate;
    }

    public void setOccupationRate(double occupationRate) {
        if (occupationRate < 10) {
            this.occupationRate = 10;
        } else if (occupationRate > 100) {
            this.occupationRate = 100;
        } else {
            this.occupationRate = occupationRate;
        }
    }

//    public  void signContract(){
//
//    }

    @Override
    public String toString() {
        return "Employee name :" + name + "\n - Age :" + getAge() + "\n - AnnualIncome :" + getAnnualIncome() +
                "\n - OccupationRate :" + occupationRate + "%";
    }
}
