class W3 {
    void pro() {
        System.out.println("Hi");
    }
}

class W4 extends W3 {
    void pro() {
        System.out.println("Hello");
    }
}

class W {
    public static void main(String[] args) {
        W3 a = new W4();

        a.pro();  // Dynamic Method Dispatch ... (Runtime Polymorphism)
    }
}