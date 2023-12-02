public class Contract {
    private ContractType type;

    // Constructor
    public Contract(ContractType type) {
        this.type = type;
    }

    // Getters and Setters
    public ContractType getType() {
        return type;
    }

    public void setType(ContractType type) {
        this.type = type;
    }
}
