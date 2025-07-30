import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class name_printer {
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


    void special()
    {
        
        String fontSize = "\u001B[6;1m";
        String resetfontSize = "\u001B[0m";

        String fileName = "ASTRO_ascii.txt";

        // Read ASCII art from file and color it
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Color the line
                String coloredLine = "\u001B[36m" + line;   // Yellow color - "\u001B[33m"  ,  Cyan color - "\u001B[36m" //
                System.out.println(fontSize+coloredLine);   // System.out.println(coloredLine);  //
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.print(resetfontSize);
        // Reset color to default
        //System.out.println("\u001B[0m"); // Resets color to default
    }
}
