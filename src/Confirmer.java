import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 class Confirmer {
    Confirmer(){
        reader();
    }

    public static void reader() {
        try {
            // Open the file
            File file = new File("log.txt");
            Scanner scanner = new Scanner(file);

            // Read arrays from the file
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] elements = line.split("\\s+"); // Split the line by whitespace
                int[] array = new int[elements.length];

                // Convert elements to integers and store in the array
                for (int i = 0; i < elements.length; i++) {
                    array[i] = Integer.parseInt(elements[i]);
                }

        

                // Check if a user-entered number exists in the array
                Scanner inputScanner = new Scanner(System.in);
                System.out.print("Enter a number to check: ");
                int number = inputScanner.nextInt();
                
                boolean exists = checkNumberInArray(number, array);
                
                if (exists) {
                    System.out.println("You have booked a ticket!: (ref: " + exists+")");
                    inputScanner.close();
                    return;
                }
                else{
                    System.out.println("You have not booked a ticket");
                }

		        //array_writer.appendNumber(1000);
                inputScanner.close();
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

  /*
   * 
   * 
   * 
   *   // Method to print an array
    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
  */

    // Method to check if a number exists in an array
    public static boolean checkNumberInArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
    
}
