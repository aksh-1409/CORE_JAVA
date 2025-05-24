import java.io.FileNotFoundException;
import java.io.FileReader;

class F1 {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            int y = 12 / 0;
            // FileReader r = new FileReader("golu.txt");
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("B");
    }    
}

/*H1.java:11: error: exception FileNotFoundException is never thrown in body of corresponding try statement
        } catch(FileNotFoundException e) {
          ^
1 error*/