import java.io.FileReader;
import java.io.FileNotFoundException;

class I3 {
    
    // The main method must declare that it throws FileNotFoundException
    // to handle the exception thrown by FileReader constructor.
public static void main(String[] args) throws FileNotFoundException {

        System.out.println("A");

        FileReader r = new FileReader("golu.txt");

        System.out.println("B");
    }    

}