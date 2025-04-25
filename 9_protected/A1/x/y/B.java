package x.y;

import a.b.c.A;

class B extends A{
    public static void main(String[] args) {
        A a = new A(); //will work
        System.out.println(a.w); //gives error
    }

}

/*x\y\B.java:8: error: w has protected access in A
        System.out.println(a.w);
                            ^
1 error*/