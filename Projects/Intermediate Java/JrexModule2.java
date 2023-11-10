/*
Joshua Rex  
Programming with Java 2235-DD
8/19/2023
*/

import java.util.ArrayList;
import java.util.Collection;

class Fan {

  // Constants for fan speeds    
  public static final int STOPPED = 0;
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;

  private int speed;
  private boolean on;
  private double radius;
  private String color;

  // Constructor
  public Fan(int speed, boolean on, double radius, String color) {
    this.speed = speed;
    this.on = on;
    this.radius = radius; 
    this.color = color;
  }

  // Getters and setters
  public int getSpeed() {
    return this.speed;
  }

  public boolean isOn() { 
    return this.on;
  }

  public double getRadius() {
    return this.radius;
  }

  public String getColor() {
    return this.color; 
  }

  // Display method
  public String displayFanInfo() {
    String onOff = this.on ? "on" : "off";
    return "Speed: " + this.speed + ", Status: " + onOff + 
           ", Radius: " + this.radius + ", Color: " + this.color;
  }

}

public class JrexModule2 {

  public static void displayFans(Collection<Fan> fans) {
    for(Fan fan : fans) {
      System.out.println(fan.displayFanInfo());
    }
  }

  public static void main(String[] args) {
    Collection<Fan> fanCollection = new ArrayList<>();

    fanCollection.add(new Fan(Fan.MEDIUM, true, 8, "blue"));
    fanCollection.add(new Fan(Fan.FAST, false, 5, "red"));
    fanCollection.add(new Fan(Fan.SLOW, true, 7, "green"));

    displayFans(fanCollection);
  }

}
