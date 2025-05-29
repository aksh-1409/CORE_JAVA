import java.io.FileNotFoundException;
import java.io.FileReader;

class Y2 {
    Y2() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
    }
}

class Z3 extends Y2 {
    Z3()  {
        try {
            super();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        System.out.println("A");

        Z3 a = new Z3();

        System.out.println("B");
    }
}


// Z4.java:13: error: call to super must be first statement in constructor
//             super();
//                  ^
// 1 error