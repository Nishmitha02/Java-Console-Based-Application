import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

 class Filing_agency {

    FileAppender fl_ap = new FileAppender();

    static String a;
    static String b;
    static int c;
    static String[] ar;
    static int a1;
    static int b1;
    static int c1;
    static int y1;
    

    void call(String var1, String var2, String[] var3, int var4, int var5, int var6, int var7, int var8 ){
        a=var1; // dest1
        b=var2; //dept
        ar = var3; //passenger names
        c=var4; // any minors
        a1=var5; //no.of pax
        b1=var6;//date
        c1=var7;//month
        y1 = var8;//year
        FileAppender.filing();
    }
    
}




 class FileAppender {

     

      static void filing() {
        String var1 = Filing_agency.a;
        String var2 = Filing_agency.b;
        String[] var3 = Filing_agency.ar;
        int var4 = Filing_agency.c;
        int var5 = Filing_agency.a1;
        int var6 = Filing_agency.b1;
        int var7 = Filing_agency.c1;
        int var8 = Filing_agency.y1;

        // Call the method to append data to the file
        caller2(var1, var2, var3, var4, var5, var6, var7, var8);
    }

    public static void caller2(String var1, String var2, String[] var3, int var4, int var5, int var6, int var7, int var8) {
        // Define the file path
        String filePath = "booking_list.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Append the data to the file
            writer.write("~~~~~~~~~~~~\n");
            writer.write("Departure: " + var1 + "\n");
            writer.write("Destination: " + var2 + "\n");
            writer.write("Passenger Names:\n");
            for (String passenger : var3) {
                if(passenger == null) continue;
                writer.write("- " + passenger + "\n");
            }
            writer.write("Minors: " + var4 + "\n");
            writer.write("Number of Passengers: " + var5 + "\n");
            writer.write("Date: " + var6 + "\n");
            writer.write("Month: " + var7 + "\n");
            writer.write("Year: " + var8 + "\n");
            writer.write("~~~~~~~~~~~~\n");
            writer.newLine(); // Add a new line between entries
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

