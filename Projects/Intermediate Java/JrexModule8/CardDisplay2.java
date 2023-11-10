//Joshua Rex
//Intermediate Java Programming
//9/14/23

package com.example.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.util.Random;

public class CardDisplay2 extends Application {

    @Override
    public void start(Stage stage) {

        //This uses the command user.dir to find where in the computer this file has been unpacked
        String userDir = System.getProperty("user.dir");

        //The user directory only gives the root folder where this has been unpacked, so I extend the path here to make sure it finds the card images
        //Using this path, I load the file that the program will use to create an array of images
        File folder = new File(userDir + "");

        //Create an array of the image files
        File[] cardFiles = folder.listFiles();

        //This is leftover from testing, but if for any reason the program cannot find the folder containing the player cards, this will display
        if(cardFiles == null) {
            System.out.println("Error finding AssignmentCards folder");
            return; }
        //Create HBox layout component to hold ImageViews
        HBox cardBox = new HBox(10);

        //Random integers for random cards
        Random rand = new Random();

        //For loop to get four random cards
        for(int i=0; i < 4; i++) {
            int index = rand.nextInt(52);

            //Grabs the appropiate filename from the index, according to the card number generated
            String file = cardFiles[index].getName();

            // Grabs the image from the AssignmentCards folder
            Image image = new Image(folder.getPath() + "/" + file);

            //Create an ImageView to hold the image
            ImageView imageView = new ImageView(image);

            //Add ImageView to HBox
            cardBox.getChildren().add(imageView);
        }
        //Setup a scene to display the cards from Hbox
        Scene scene = new Scene(cardBox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

/* I had an awful time trying to get Javafx working properly.
* After numerous youtube videos and failed installs, Benjamin Nairn (who
* I worked with in my project group) found the following git project
* that helped me get the code to run properly: https://github.com/mjparme/javafx-template */