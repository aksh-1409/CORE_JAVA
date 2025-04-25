class Y1 {
    static int a = 17;
}

class Y2 extends Y1 {
    static int a = 23;
}

class B {
    public static void main(String[] args) {
        Y1 x = new Y2();

        System.out.println(x.a);
    }
}