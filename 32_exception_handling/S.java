class S {
    public static void main(String[] args) {
            System.out.println("S");
            aaa();
            System.out.println("E");        
    }   

    static void aaa() {
        System.out.println("Q");
        bbb();
        System.out.println("K");
    }

    static void bbb() {
        System.out.println("J");
        ccc();
        System.out.println("D");
    }

    static void ccc()  {
        System.out.println("Y");

        try {
            int y = 12 / 0;
        } catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("H");
    }
}
/*
S
Q
J
Y
java.lang.ArithmeticException: / by zero
/ by zero
java.lang.ArithmeticException: / by zero
        at S.ccc(S.java:24)
        at S.bbb(S.java:16)
        at S.aaa(S.java:10)
        at S.main(S.java:4)
H
D
K
E*/