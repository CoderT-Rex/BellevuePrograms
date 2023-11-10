//Example by BroCode
//https://www.youtube.com/watch?v=LEJ1kGHSXdA

import java.awt.event.*;
import javax.swing.*;

@FunctionalInterface
public interface MyInterface {
    void message(String name, char symbol);
}

public class LambdaExamples {

    public static void main(String[] args) {

        // Example 1: Lambda Expressions with a User-Defined Functional Interface

        String name = "Bro";
        char symbol = '!';

        MyInterface myInterface = (x, y) -> {
            System.out.println("Hello, World!");
            System.out.println("It is a nice day " + x + y);
        };

        MyInterface myInterface2 = (x, y) -> {
            System.out.println("Hello " + x + y);
        };

        myInterface.message(name, symbol);
        myInterface2.message(name, symbol);

        // Example 2: Lambda Expressions in a Swing GUI Application

        MyFrame myFrame = new MyFrame();
    }
}

class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON 1");
    JButton myButton2 = new JButton("MY BUTTON 2");

    MyFrame() {

        myButton.setBounds(100, 100, 200, 100);
        myButton.addActionListener(
            (e) -> System.out.println("This is the first button")
        );

        myButton2.setBounds(100, 200, 200, 100);
        myButton2.addActionListener(
            (e) -> System.out.println("This is the second button")
        );

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
