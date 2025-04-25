class W1 {
    static void pro() {
        System.out.println("pro in parent----");
    }
}

class W2 extends W1 {
    static void pro() {
        System.out.println("pro in child-----");
    }
}

class D {
    public static void main(String[] args) {
        W1 a = new W2();

        a.pro();
    }
}