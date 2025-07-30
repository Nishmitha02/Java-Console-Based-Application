import java.util.Random;
import java.util.Scanner;

 final class Secure {
    array_writer aw = new array_writer();

    Secure() throws InterruptedException{

    String YELLOW = "\u001B[33m";
    String RESET = "\u001B[0m";

    System.out.println(YELLOW+"[TOWER Security] V : 1.0.0.1a ");
    System.out.print("Secure protocol Initiated.");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.print(".");
    Thread.sleep(500);
    System.out.println(" Command given to Pilot program!!"+RESET);
   }
   
   private int p, q , n, phi, e, d;

   private char characters[];
   Scanner javain = new Scanner(System.in);


   protected void prot1()
   {
      // Accept input string
      System.out.print("Enter any random word: ");
      String input = javain.nextLine();

      // Split the string into individual characters
       characters = input.toCharArray();
   }


   protected void prot2()
   {
    // Generate public and private keys
    Random random = new Random();
    p = generateRandomPrime(random);
    q = generateRandomPrime(random);
    n = p * q;
    phi = (p - 1) * (q - 1);
    e = generateRandomExponent(phi);
    d = modInverse(e, phi);
   }

   protected void debug_prot()
   {
    // Display the public and private keys
    System.out.println("\nPublic Key (n, e): (" + n + ", " + e + ")");
    System.out.println("Private Key (n, d): (" + n + ", " + d + ")");

    // Encrypt and decrypt each character using the keys
    System.out.println("\nCharacter   Encrypted   Decrypted");
    for (char ch : characters) {
        int number = getAlphabetNumber(ch);
        int encryptedNumber = modularExponentiation(number, e, n);
        int decryptedNumber = modularExponentiation(encryptedNumber, d, n);
        char decryptedChar = getAlphabetCharacter(decryptedNumber);
        System.out.printf("%-12c %-12d %c\n", ch, encryptedNumber, decryptedChar);
    }
   }

   protected void Key_printer(){
    
    String YELLOW = "\u001B[33m";
    String RESET = "\u001B[0m";

    System.out.println("Private Identifier[Must be provided at the gate while checking-in] :");

    System.out.println();
    System.out.println(YELLOW+ d);
    System.out.println(RESET);

    array_writer.rsa_print(d);
   } 



    // Method to generate a random prime number
    public static int generateRandomPrime(Random random) {
        int num;
        do {
            num = random.nextInt(100) + 100; // Generate a random number between 100 and 199
        } while (!isPrime(num));
        return num;
    }

    // Method to generate a random public exponent within range (1, phi)
    public static int generateRandomExponent(int phi) {
        Random random = new Random();
        int e;
        do {
            e = random.nextInt(phi - 1) + 1; // Generate a random number between 1 and phi - 1
        } while (gcd(e, phi) != 1); // Ensure e and phi are coprime
        return e;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to compute the greatest common divisor (GCD) of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to get the number corresponding to an alphabet character
    public static int getAlphabetNumber(char ch) {
        if (Character.isUpperCase(ch)) {
            return ch - 'A' + 1;
        } else if (Character.isLowerCase(ch)) {
            return ch - 'a' + 1;
        } else {
            return -1; // Return -1 for non-alphabetic characters
        }
    }

    // Method to get the alphabet character corresponding to a number
    public static char getAlphabetCharacter(int num) {
    if (num >= 1 && num <= 26) {
        return (char) ('A' + num - 1);
    } else if (num >= 27 && num <= 52) {
        return (char) ('a' + num - 27);
    } else {
        return ' '; // Return space for numbers outside the range [1, 52]
    }
}


    // Method to compute the modular exponentiation
    public static int modularExponentiation(int base, int exponent, int modulus) {
        int result = 1;
        base = base % modulus;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            exponent = exponent >> 1;
            base = (base * base) % modulus;
        }
        return result;
    }

    // Method to compute the modular multiplicative inverse
    public static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return 1;
    }
    
}

