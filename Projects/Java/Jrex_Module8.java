
/**
 * Joshua Rex
 * Programming with Java 2235-DD
 * 6/28/2023
 */
public class Jrex_Module8 {

//Class that returns the standard price of a yearly service. Since no parameters
//were given for assignment, $100 was chosen.
    public static double yearlyService(){
    return 100.00;
    }

//Overload the method with one parameter, an oil change.    
    public static double yearlyService(double oilChange){
    return 100.00 + oilChange;
    }
    
//Overload the method with two parameters, an oil change and a tire rotation.        
    public static double yearlyService(double oilChange, double tireRotation){
    return 100.00 + oilChange + tireRotation;
    }
    
//Overload the method with three parameters, an oil change, a tire rotation and a coupon.    
    public static double yearlyService(double oilChange, double tireRotation, double coupon){
    return 100.00 + oilChange + tireRotation - coupon;
    }
    
    
    public static void main(String args[]) {
        
//Initiate a double that will keep track of the cost of the car service. Assign it
//the standard cost according to the method. Use a formatted print so dollar amount
//displays correctly.
        double carCost = yearlyService();
        System.out.printf("Your total cost for yearly service is $%.2f%n", carCost);
        
//Initiate the method with one parameter, adding an oil change.        
        carCost = yearlyService(40.00);
        System.out.printf("Your total cost for yearly service plus an oil change is $%.2f%n", carCost);
        
//Initiate the method with two parameters, adding a tire rotation.          
        carCost = yearlyService(40.00, 75.00);       
        System.out.printf("Your total cost for yearly service, oil change, and tire rotation is $%.2f%n", carCost);
        
//Initiate the method with three parameters, adding a coupon.          
        carCost = yearlyService(40.00, 75.00, 30.00);
        System.out.printf("Your total cost for yearly service, oil change, and tire rotation after your coupon is $%.2f%n", carCost);
        
//Assignment asked me to demonstrate each function working twice        
        carCost = yearlyService();
        System.out.printf("Your total cost for yearly service is $%.2f%n", carCost);
     
//Initiate the method with one parameter, adding an oil change with a slightly different cost.           
        carCost = yearlyService(45.00);
        System.out.printf("Your total cost for yearly service plus an oil change is $%.2f%n", carCost);
        
//Initiate the method with two parameters, adding a tire rotation with a slightly different cost.         
        carCost = yearlyService(45.00, 69.00);
        System.out.printf("Your total cost for yearly service, oil change, and tire rotation is $%.2f%n", carCost);
        
//Initiate the method with three parameters, adding a coupon with a slightly different discount.        
        carCost = yearlyService(45.00, 69.00, 25.00);
        System.out.printf("Your total cost for yearly service, oil change, and tire rotation after your coupon is $%.2f%n", carCost);
    }
}

//Problems with code: unable to recieve discount without getting multiple services,
//however this was written according to class instructions.