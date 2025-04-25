package a.b.c;

class C extends A {
    public static void main(String[] args) {
        C a = new C(); //work
        a.pro(); //not work
    }
}

/*
// a\b\c\C.java:7: error: cannot find symbol
//         a.pro();
//          ^
//   symbol:   method pro()
//   location: variable a of type C
// 1 error*/
