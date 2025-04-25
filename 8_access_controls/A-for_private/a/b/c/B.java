package a.b.c;

class B{
    public static void main(String[] args) {
        A a = new A(); //work
        a.pro(); //not work
    }
}
/*error: pro() has private access in A
        a.pro(); //not work
         ^
1 error*/