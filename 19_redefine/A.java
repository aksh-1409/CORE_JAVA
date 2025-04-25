class X1 {
    int a = 9;
}

class X2 extends X1 {
    int a = 15;
}

class A {
    public static void main(String[] args) {
        X1 x = new X2();

        System.out.println(x.a);
    }
}