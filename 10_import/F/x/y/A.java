package x.y;

import a.b.c.B;
import a.b.B;

class A{
    public static void main(String[] args) {
        B a;
        B b;
    }
}

/*x\y\A.java:4: error: a type with the same simple name is already defined by the single-type-import of B
import a.b.B;
^
x\y\A.java:8: error: reference to B is ambiguous
        B a;
        ^
  both class a.b.c.B in a.b.c and class a.b.B in a.b match       
x\y\A.java:9: error: reference to B is ambiguous
        B b;
        ^
  both class a.b.c.B in a.b.c and class a.b.B in a.b match       
3 errors*/