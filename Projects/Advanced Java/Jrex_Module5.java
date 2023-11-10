
/**
 *Joshua Rex
 * Advanced Java Programming
 * 10/31/2023
 */

import java.io.*;
import java.util.TreeSet;

public class Jrex_Module5 {
    public static void main(String[] args) {
        try {
            // Read the words from the text file so they can be sorted
            BufferedReader reader = new BufferedReader(new FileReader("collection_of_words.txt"));
            String line;
            TreeSet<String> sortedWords = new TreeSet<>();
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(", "); //if the text document's words were not split with commas and spaces, this line would need to be changed
                for (String word : words) {
                    sortedWords.add(word); //TreeSets automatically remove any duplicate words and sort them alphabetically
                }
            }
            reader.close();


            // Display results

            System.out.println("Non-duplicate words in ascending order:");
            for (String word : sortedWords) {
                System.out.println(word);
            }
            
            //Descending order
            
            System.out.println("\nNon-duplicate words in descending order:");
            for (String word : sortedWords.descendingSet()) {
                System.out.println(word);
            }
            
            //Error message, if file can't be found
            
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
