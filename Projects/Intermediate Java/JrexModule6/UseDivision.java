// UseDivision.java
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision intlDivision1 = new InternationalDivision("IntlDiv1", "INT001", "Canada", "English");
        InternationalDivision intlDivision2 = new InternationalDivision("IntlDiv2", "INT002", "France", "French");
        DomesticDivision domDivision1 = new DomesticDivision("DomDiv1", "DOM001", "New York");
        DomesticDivision domDivision2 = new DomesticDivision("DomDiv2", "DOM002", "California");

        intlDivision1.display();
        intlDivision2.display();
        domDivision1.display();
        domDivision2.display();
    }
}

