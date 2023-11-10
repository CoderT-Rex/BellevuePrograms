// InternationalDivision.java
public class InternationalDivision extends Division {
    private String country;
    private String languageSpoken;

    public InternationalDivision(String divisionName, String accountNumber, String country, String languageSpoken) {
        super(divisionName, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Division Name: " + super.divisionName);
        System.out.println("Account Number: " + super.accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language Spoken: " + languageSpoken);
    }
}
