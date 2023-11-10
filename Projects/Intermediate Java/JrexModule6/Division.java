// Division.java
public abstract class Division {
    private String divisionName;
    private String accountNumber;

    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}

