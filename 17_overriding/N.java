class Y5 {
    /*private*/ void pro() {
        System.out.println("pro method in Parent");
    }
    
}
class N extends Y5 {
    int pro() {
        System.out.println("pro method in Parent");

        return 1;
    }
}

/*N.java:8: error: pro() in N cannot override pro() in Y5
    int pro() {
        ^
  return type int is not compatible with void
1 error*/