import java.io.FileNotFoundException;
import java.io.FileReader;

class Y2 {
    Y2() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
    }
}

class Z1 extends Y2 {
    Z1() {
        super();
    }
    
    public static void main(String[] args) {
        System.out.println("A");

        Z1 a = new Z1();

        System.out.println("B");
    }
}


// Z1.java:12: error: unreported exception FileNotFoundException; must be caught or declared to be thrown
//         super();
//              ^
// 1 error