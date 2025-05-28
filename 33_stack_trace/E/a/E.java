package a;

import c.X2;

class E {
    public static void main(String[] args) {
        X2.bbb();
        System.out.println("R");
    }
}

/*K
U
Y
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at d.X3.ccc(X3.java:6)
        at b.X1.aaa(X1.java:8)
        at c.X2.bbb(X2.java:8)
        at a.E.main(E.java:7)*/