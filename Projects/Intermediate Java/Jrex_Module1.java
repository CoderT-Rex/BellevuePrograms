/*
 Joshua Rex
Programming with Java 2235-DD
8/10/2023
 */
public class Jrex_Module1 {

    public static void main(String args[]) {
        //initialize fan with default values
        Fan fan1 = new Fan();
        //intialize fan with specific values
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "blue");
        
        //Invoke toString to show each fan's status
        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
        
        //change one fan's attributes with setters
        fan1.setSpeed(Fan.FAST);
        fan1.setPower(true);
        fan1.setRadius(10.0);
        fan1.setColor("red");
        
        //show fan's changes with getters
        System.out.println(fan1.getSpeed());
        System.out.println(fan1.getPower());
        System.out.println(fan1.getRadius());
        System.out.println(fan1.getColor());
    }}
    
//Create fan class    
class Fan{

    //Set speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    //Create intial fan attributes
    int speed;
    boolean power;
    double radius;
    String color;
    
    //Constructor for a fan with default attributes
    Fan() { 
        speed = STOPPED;
        power = false;
        radius = 6.0;
        color = "white";}

    //Constructor for a fan that takes specified attributes
    Fan(int speed, boolean power, double radius, String color) { 
        this.speed = speed;
        this.power = power;
        this.radius = radius;
        this.color = color;}

    //Setters for fan attributes
    public void setSpeed(int speed){
        this.speed = speed;}
    
    public void setPower(boolean power){
        this.power = power;}
    
    public void setRadius(double radius){
        this.radius = radius;}
    
    public void setColor(String color){
        this.color = color;}
 
    //Getters for fan attributes
    public int getSpeed(){
        return speed;}
    
    public boolean getPower(){
        return power;}
    
    public double getRadius(){
        return radius;}
    
    public String getColor() {
        return color;}
    
    // toString method
    public String toString() {
        String state = power ? "on" : "off";
        return "Fan [speed=" + speed + ", status=" + state + ", radius=" + radius + ", color=" + color + "]";
    }
}
