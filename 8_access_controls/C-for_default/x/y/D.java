package x.y;
import a.b.c.A;
class D{
    public static void main(String[] args) {
        A a = new A(); 
         a.pro();
    }
}
/*error: pro() is not public in A; cannot be accessed from outside package
         a.pro();
          ^
1 error*/
