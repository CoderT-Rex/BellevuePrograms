// DomesticDivision.java
public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Division Name: " + super.divisionName);
        System.out.println("Account Number: " + super.accountNumber);
        System.out.println("State: " + state);
    }
}
