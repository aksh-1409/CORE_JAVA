class A1 {
    void pro() {
        System.out.println("Hello");
    }
}

class A2 extends A1 {
    void pro() {
        System.out.println("Hi");
    }
}

class A3 extends A1 {
    void pro() {
        System.out.println("Namaste");
    }
}

class B {
    public static void main(String[] args) {
        A1 x = new A2();

        x.pro();

        x = new A3();

        x.pro();
    }    
}