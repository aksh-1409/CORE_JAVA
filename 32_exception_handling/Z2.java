import java.io.FileNotFoundException;
import java.io.FileReader;

class Y2 {
    Y2() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
    }
}

class Z2 extends Y2 {
    Z2() throws FileNotFoundException {
        super();
    }
    
    public static void main(String[] args) {
        System.out.println("A");

        Z2 a = new Z2();

        System.out.println("B");
    }
}

// Z2.java:18: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         Z2 a = new Z2();
//                ^
// 1 error