class I {
    static {
        System.out.println("A");
        int y = 12 / 0;
        System.out.println("B");
    }
    public static void main(String[] args) {
        System.out.println("X");
    }    
}

/*A
Exception in thread "main" java.lang.ExceptionInInitializerError 
Caused by: java.lang.ArithmeticException: / by zero
        at I.<clinit>(I.java:4)*/