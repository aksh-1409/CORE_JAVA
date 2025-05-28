class X1 {
    X1() {
        int y = 12 / 0;
    }
}

class X2 extends X1 {
    
}

class X3 extends X2 {
    
}

class G extends X3 {
    public static void main(String[] args) {
        G z = new G();
    }    
}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at X1.<init>(G.java:3)
        at X2.<init>(G.java:7)
        at X3.<init>(G.java:11)
        at G.<init>(G.java:15)
        at G.main(G.java:17)*/