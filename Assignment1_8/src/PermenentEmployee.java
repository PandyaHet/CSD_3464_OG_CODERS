public class PermenentEmployee extends Contract{
    private int daysWorked;
    private double fixedMonthlySalary;
    private int numberOfChildren;
    private boolean civilStatus;
    private double childAllowance;

    // Constructor
    public PermenentEmployee(int numberOfChildren,boolean civilStatus, double fixedMonthlySalary, double childAllowance, int daysWorked ) {
        this.daysWorked = daysWorked;
        this.fixedMonthlySalary = fixedMonthlySalary;
        this.numberOfChildren = numberOfChildren;
        this.civilStatus = civilStatus;
        this.childAllowance = childAllowance;
    }
//
    // Method to calculate accumulated salary for a permanent employee
    public double accumulatedSalary() {
        return (daysWorked * (fixedMonthlySalary + childAllowance * numberOfChildren)) / 20;
    }

    public void convertFrom(double accumulatedSalary) {
        this.daysWorked = (int) (accumulatedSalary / ((this.fixedMonthlySalary + (this.civilStatus ? (this.numberOfChildren * this.childAllowance) : 0)) / 20));
    }
//
//    // Method to change contract type
//    public void changeContractType(ContractType newContractType) {
//        if (newContractType == ContractType.TEMPORARY) {
//            setContract(new Contract(ContractType.TEMPORARY));
//            // Convert accumulated salary if needed
//            setMonthlyIncome(accumulatedSalary() / (daysWorked / 20)); // Assuming 20 working days per month
//        }
//    }
//
    // Overriding toString for better representation
    @Override
    public String toString() {
//        return "\nDays Worked: " + daysWorked + "\nFixed Monthly Salary: " + fixedMonthlySalary
//                + "\nNumber of Children: " + numberOfChildren + "\nCivil Status: " + (civilStatus?"married":"unmarried")
//                + "\nChild Allowance: " + childAllowance;
        return " He/She is" +(civilStatus?"married":"not married")+" and he/she has " + numberOfChildren + " Childrens. he/she has worked for " + daysWorked+" days and upon contract his/her monthly salary is "+fixedMonthlySalary+"\n";
    }

}
