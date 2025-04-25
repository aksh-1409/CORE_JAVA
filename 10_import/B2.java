import java.io.File;
import java.sql.Date;

class B2 {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~start~~~~~~~~~~~~~~~~~~");
        File a;
        Date b;
        Format c; //will not work 
        ArrayList d; //will not work 
        System.out.println("~~~~~~~~~~~~~~~~end~~~~~~~~~~~~~~~~~");
    }
}
/*B2.java:9: error: cannot find symbol
        Format c; //will not work
        ^
  symbol:   class Format
  location: class B2
B2.java:10: error: cannot find symbol
        ArrayList d; //will not work
        ^
  symbol:   class ArrayList
  location: class B2
2 errors*/