class A {
    // Compile-time polymorphism

    //Legal Case of method overloading
    static void pro(char a) {
        System.out.println(a + " ------- char");
    }

    static void pro(int a) {
        System.out.println(a + " ~~~~~~~~ int");
    }
    
    static void pro(float a) {
        System.out.println(a + " ^^^^^^^^^ float");
    }

    public static void main(String[] args) {
        pro(44);      // ok
        pro(4.5f);    // ok
        pro('A');    // ok
        // pro(7.2);     // not ok
    }
}

/*// A.java:16: error: no suitable method found for pro(double)
//         pro(7.2);     // not ok
//         ^
//     method A.pro(int) is not applicable
//       (argument mismatch; possible lossy conversion from double to int)
//     method A.pro(float) is not applicable
//       (argument mismatch; possible lossy conversion from double to float)
// 1 error*/




