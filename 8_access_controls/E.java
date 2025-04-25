class A {
    private int y = 99;
}

class E{
    public static void main(String[] args) {
        A x = new A(); //will work
        System.out.println(x.y); //will not work
    }
}

/*E.java:8: error: y has private access in A
        System.out.println(x.y);
                            ^
1 error*/