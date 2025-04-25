class X4 {
    static void pro() {

    }
}

class D extends X4 {
    void pro() {

    }
}

/*D.java:8: error: pro() in D cannot override pro() in X4
    void pro() {
         ^
  overridden method is static
1 error*/