package x.y;

import a.b.c.A;

class B extends A {
    public static void main(String[] args) {
        B a = new B();     // ok
        // A a = new A();     // not ok

        System.out.println(a.w);
    }
}