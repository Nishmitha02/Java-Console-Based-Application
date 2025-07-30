import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

    class special_astro {
       void stars() {

            int rows = 10; // Number of rows
            int cols = 32; // Number of columns
            int gapSize = 4; // Size of the gap between characters
            double starProbability = 0.44; // Probability of generating "*"
    
            Random random = new Random();
    
            String fontSize = "\u001B[6;1m";
            String resetfontSize = "\u001B[0m";
            
        
            System.out.println(fontSize);
            // Loop through each row
            for (int i = 0; i < rows; i++) {
                // Loop through each column
                for (int j = 0; j < cols; j++) {
                    // Generate a random number between 0 and 1
                    double randNum = random.nextDouble();
                    // If the random number is less than starProbability, print "*"
                    // Otherwise, print "."
                    if (randNum < starProbability) {
                        System.out.print("*");
                    } else {
                        System.out.print(".");
                    }
                    // Print the gap
                    for (int k = 0; k < gapSize; k++) {
                        System.out.print(" ");
                    }
                }
                // Move to the next line after each row
                System.out.println();
            }
            System.out.println(resetfontSize);
            return;
        }
    
    


    void special2()
    {
        
        String fontSize = "\u001B[6;1m";
        String resetfontSize = "\u001B[0m";

        String fileName = "ASTROdiffer.txt";

        // Read ASCII art from file and color it
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Color the line
               String green = "\u001B[32m";
                String coloredLine = green+line;   // Yellow color - "\u001B[33m"  ,  Cyan color - "\u001B[36m" //
                System.out.println(fontSize+coloredLine);   // System.out.println(coloredLine);  //
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.print(resetfontSize);
        return;
        // Reset color to default
        //System.out.println("\u001B[0m"); // Resets color to default
    }
}




    /*** 
    name_printer()
    {
        String fontSize = "\u001B[6;1m";
        String resetfontSize = "\u001B[0m";

        String fileName = "file read test.txt";

        // Read ASCII art from file and color it
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Color the line
                String coloredLine = "\u001B[36m" + line; // Yellow color - "\u001B[33m"  ,  Cyan color - "\u001B[36m" 
                System.out.println(fontSize+coloredLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.print(resetfontSize);
        // Reset color to default
        System.out.println("\u001B[0m"); // Resets color to default
        
    }
    ***/