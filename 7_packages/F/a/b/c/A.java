package a.b.c;
import x.y.B;
class A{
    public static void main(String[] args) {
        B a = new B();
        
        System.out.println(a.y); // Creating an instance of class B
    }
}

/*error: y is not public in B; cannot be accessed from outside package
        System.out.println(a.y); // Creating an instance of class B
                            ^
1 error*/