import java.util.*;

final public class App {
    public static void main(String[] args) throws Exception {
        ///Class definition(s)
        
        Secure Security = new Secure();
        booking booker = new booking();

        Scanner javain = new Scanner(System.in);
        name_printer  n   = new name_printer();
        final String fontSize = "\u001B[6;1m";
        final String resetFontSize = "\u001B[0m";
        
        n.special();

        System.out.println();
        System.out.println("--> Now supporting Bookings from your trusted CLI.\n\n");
        
        

        System.out.println(fontSize + "Book your Flights here!!");
        System.out.print(resetFontSize);


        

        
        for(int i=0;i<5; i--){

        System.out.println("Enter 'BOOK' to Book a flight or enter 'CONFIRM' to confirm your booking.");
        System.out.println("You can also type 'EXIT' to exit out of the program.");
        System.out.print("\nEnter your option :");
        String opt = javain.next();
        
        switch (opt) {
            case "BOOK":
                System.out.println("Welcome to ASTRO :");
                booker.booking_ph0();
                booker.booking_ph1();
                Security.prot1();
                booker.booking_ph2();
                booker.booking_ph3();
                Security.prot2();
                Security.Key_printer();
                //Security.debug_prot();
                booker.booking_ph4();
                break;
            
            case "CONFIRM":
            System.out.println("Welcome to ASTRO booking confirmation dept. , Please enter the details as followed by the prmopt: ");
            Confirmer.reader();

            break;

            case "EXIT":
            System.out.println("Thank you for using ASTRO services!, hope you have a great day.");
            return;


            default:
                    System.out.println("You have entered ( "+opt+" ) which is not the aforementioned option. Please enter the correct query."); i++; break; 
        }
    }
        javain.close();
    }
}
