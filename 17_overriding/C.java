class X3 {
    void pro() {

    } 
}

class C extends X3 {
    static void pro() {

    }    
}

/*C.java:8: error: pro() in C cannot override pro() in X3
    static void pro() {
                ^
  overriding method is static
1 error*/