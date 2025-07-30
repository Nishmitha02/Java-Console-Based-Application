import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class array_writer {

    private static String FILENAME = "log.txt";

    public static void rsa_print(int number) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
            writer.write(Integer.toString(number));
            writer.write(" "); // Adding space after each number
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
