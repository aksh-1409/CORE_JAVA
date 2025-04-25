interface Y1 {
    int a = 91;
}

class L {
    public static void main(String[] args) {
        System.out.println(Y1.a);  // variable a is implicitly static ...
    }
}