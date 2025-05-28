class X1 {
    static void aaa() {
        System.out.println("U");
        X3.ccc();
    }
}
 

class C {
    public static void main(String[] args) {
        X2.bbb();
        System.out.println("R");
    }
}


class X2 {
    static void bbb() {
        System.out.println("K");
        X1.aaa();
    }
}    

class X3 {
    static void ccc() {
        System.out.println("Y");
        int y = 12 / 0;
    }
}

/*
K
U
Y
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at X3.ccc(C.java:27)
        at X1.aaa(C.java:4)
        at X2.bbb(C.java:20)
        at C.main(C.java:11)*/