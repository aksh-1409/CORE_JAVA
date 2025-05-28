class H {
    {
        System.out.println("M");
        int y = 12 / 0;
    }

    H() {
        System.out.println("A");
    }
    public static void main(String[] args) {
        System.out.println("X");
        
        H x = new H();

        System.out.println("T");
    }    
}

/*
M
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at H.<init>(H.java:4)
        at H.main(H.java:13)*/