package a.b.c;
import x.y.B; // Importing statement for class B
class A{
    public static void main(String[] args) {
        B x; 
    }
}

/* error: B is not public in x.y; cannot be accessed from outside package
import x.y.B; // Importing statement for class B
          ^
a\b\c\A.java:5: error: B is not public in x.y; cannot be accessed from outside package
        B x;
        ^
2 errors*/

