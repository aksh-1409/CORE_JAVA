class F {
    F() {
        int y = 12 / 0;
        System.out.println("C");
    }   
    
    public static void main(String[] args) {
        System.out.println("A");
        
        F x = new F();

        System.out.println("B");
    }
}
/*A
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at F.<init>(F.java:3)
        at F.main(F.java:10*/