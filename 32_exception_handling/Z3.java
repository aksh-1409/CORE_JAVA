import java.io.FileNotFoundException;
import java.io.FileReader;

class Y2 {
    Y2() throws FileNotFoundException {
        FileReader fr = new FileReader("abc.txt");
    }
}

class Z3 extends Y2 {
    Z3() throws FileNotFoundException {
        super();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("A");

        Z3 a = new Z3();

        System.out.println("B");
    }
}
/*
A
Exception in thread "main" java.io.FileNotFoundException: abc.txt (The system cannot find the file specified)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
        at java.base/java.io.FileReader.<init>(FileReader.java:60)
        at Y2.<init>(Z3.java:6)
        at Z3.<init>(Z3.java:12)
        at Z3.main(Z3.java:18)*/