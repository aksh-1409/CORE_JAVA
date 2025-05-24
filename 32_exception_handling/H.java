class H {
    public static void main(String[] args) {
        System.out.println("A");

        try {
            String input = args[0];
        } catch(ArithmeticException e) {
            System.out.println(e);
        }

        System.out.println("B");
    }    
}

/*A
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at H.main(H.java:6)*/