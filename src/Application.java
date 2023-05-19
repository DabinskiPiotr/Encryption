import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    private String message;
    private String filename;
    private Key key;
    private Scanner scan = new Scanner(System.in);
    CaesarCipher cC = new CaesarCipher();

    private void runMenu() {
        String response;
        do {
            printMenu();
            System.out.println("What would you like to do:");
            scan = new Scanner(System.in);
            response = scan.nextLine().toUpperCase();
            switch (response) {
                case "1":
                    initialiseMessage();
                    break;
                case "2":
                    System.out.println("With what shift should I encrypt the message?");
                    int shift = scan.nextInt();
                    String encryptedMessage = cC.encrypt(message, shift);
                    System.out.println(encryptedMessage.toUpperCase().replaceAll(" ",""));
                    break;
                case "3":
                    for(int i=0; i<26; i++){
                        CaesarCipher jd = new CaesarCipher();
                        String alljd = jd.encrypt("jebac disa",i);
                        System.out.println(alljd);
                        String decryptedjd = jd.decrypt(alljd,i);
                        System.out.println(decryptedjd);
                    }
                    break;
                case "4":
                    VigenereCipher test = new VigenereCipher();
                    String encryptedTest = test.encrypt("Hello World", "lemon");
                    System.out.println(encryptedTest);
                    String decryptedTest = test.decrypt(encryptedTest,"lemon");
                    System.out.println(decryptedTest);
                    break;
                case "5":
                  String decryptedMessage = cC.decrypt("IFMMPXPSME", 1);
                    System.out.println(decryptedMessage.toUpperCase().replaceAll(" ",""));
                    break;
                case "6":
                       /* KeyedCaesarCipher idk = new KeyedCaesarCipher();
                    String abc = idk.uniquify("ABcdabcdABCD");
                    System.out.println(abc);

                    KeyedCaesarCipher alphabetModi = new KeyedCaesarCipher();
                    System.out.println(alphabetModi.replaceAlphabet("kajak"));*/
                    break;
                case "7":
                    break;
                case "Q":

                    break;
                default:
                    System.out.println("Try again");
            }
        } while (!(response.equals("Q")));
    }

    private void printMenu() {
        System.out.println("1 - Load a file with the message");
        System.out.println("2 - Encrypt with Caesar Cipher ");
        System.out.println("3 - Encrypt with Keyed Caesar Cipher");
        System.out.println("4 - Encrypt with Vigenere Cipher");
        System.out.println("5 - Decrypt with Caesar Cipher");
        System.out.println("6 - Decrypt with Keyed Caesar Cipher");
        System.out.println("7 - Decrypt with Vigenere Cipher");
        System.out.println("8 - Print Current Message");
        System.out.println("9 - load the key");
        System.out.println("10 - Print the Key");
        System.out.println("q -  Quit");
    }


    private void initialiseMessage(){
        scan = new Scanner(System.in);
        System.out.print("What is the name of the file? ");
        filename = scan.next();
        message = new String();
        message.toUpperCase().replaceAll(" ","");

        try {
            load(filename);
            System.out.println("Using file " + filename);
        } catch (FileNotFoundException e) {
            System.err.println("The file: " + filename + " does not exist.");
        } catch (IOException e) {
            System.err.println("An unexpected error occurred when trying to open the file " + filename);
            System.err.println(e.getMessage());
        }
    }
        public void load (String filename) throws IOException {
            FileReader fr = new FileReader(filename);
            Scanner infile = new Scanner(fr);
            infile.useDelimiter(":|\r?\n|\r");
            message = infile.next();
            infile.close();
        }

    public static void main(String args[]) {
        System.out.println("*******SYSTEM START*******");
        Application app = new Application();
        VigenereCipher vig = new VigenereCipher();
        CaesarCipher caes = new CaesarCipher();
        KeyedCaesarCipher kCaes = new KeyedCaesarCipher();
        app.runMenu();
        System.out.println("*******SYSTEM END*******");
    }
}