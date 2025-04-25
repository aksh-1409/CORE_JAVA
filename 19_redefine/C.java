class Z1 {
    void pro() {
        System.out.println("Pro in Parent");
    }
}

class Z2 extends Z1 {
    void pro() {
        System.out.println("Pro in Child");
    }
}

class C {
    public static void main(String[] args) {
        Z1 a = new Z2();

        a.pro();  //Dynamic Method Dispatch---> Runtime Polymorphism
    }
}