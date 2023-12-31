public class Programmer extends Employee{
    private int projectsCompleted;

    private  Vehicle vehicle;

    public Programmer(String name, int birthYear,int projectsCompleted, double occupationRate   ) {
        super(name, birthYear, occupationRate,EmployeeType.Programmer,null);
        this.projectsCompleted = projectsCompleted;
    }
    public Programmer(String name, int birthYear,int projectsCompleted, double occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate,EmployeeType.Programmer,vehicle);
        this.projectsCompleted = projectsCompleted;
        this.vehicle = vehicle;
    }

    public Programmer(String name, int birthYear,int projectsCompleted) {
        super(name, birthYear, 0,EmployeeType.Programmer,null);
        this.projectsCompleted = projectsCompleted;
    }
    public Programmer(String name, int birthYear,int projectsCompleted, Vehicle vehicle) {
        super(name, birthYear, 0,EmployeeType.Programmer,vehicle);
        this.projectsCompleted = projectsCompleted;
        this.vehicle = vehicle;
    }


    public int getProjectsCompleted() {
        return projectsCompleted;
    }

    @Override
    public String toString() {
        return super.toString()  +  " and completed " + projectsCompleted+" projects.";
    }
}
