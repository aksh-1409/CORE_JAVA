class W1 {
    void pro() {
        System.out.println("Hello Ji");
    }
}

class W2 extends W1 {
    void pro() {
        System.out.println("Namaskar Ji");
    }    
}

class V {
    public static void main(String[] args) {
        W2 a = new W2();
        a.pro();

        W1 b = new W1();
        b.pro();
    }
}