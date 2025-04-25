import java.io.File;

class B1 {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~start~~~~~~~~~~~~~~~~~~");
        File a; //will work
        Date b; //will not work 
        Format c; //will not work 
        ArrayList d;// will not work 
        System.out.println("~~~~~~~~~~~~~~~~end~~~~~~~~~~~~~~~~~");
    }
}
/*B1.java:7: error: cannot find symbol
        Date b; //will not work
        ^
  symbol:   class Date
  location: class B1
B1.java:8: error: cannot find symbol
        Format c; //will not work
        ^
  symbol:   class Format
  location: class B1
B1.java:9: error: cannot find symbol
        ArrayList d;// will not work
        ^
  symbol:   class ArrayList
  location: class B1
3 errors*/