public class Tester extends Employee{
    private int bugsSolved;
    private  Vehicle vehicle;

    public Tester(String name, int birthYear, double occupationRate, int bugsSolved) {
        super(name, birthYear, occupationRate,EmployeeType.Tester,null);
        this.bugsSolved = bugsSolved;
    }

    public Tester(String name, int birthYear, double occupationRate, int bugsSolved, Vehicle vehicle) {
        super(name, birthYear, occupationRate,EmployeeType.Tester,vehicle);
        this.bugsSolved = bugsSolved;
        this.vehicle = vehicle;
    }

    public int getBugsSolved() {
        return bugsSolved;
    }

    @Override
    public String toString() {
        return super.toString() + " and corrected " + bugsSolved+ " bugs.";
    }
}
