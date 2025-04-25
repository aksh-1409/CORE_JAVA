class Z6 {
    void pro() {
        System.out.println("Hello Ji");
    }
}

class Z7 extends Z6 {

}

class U {
    public static void main(String[] args) {
        Z7 a = new Z7();

        a.pro();
    }
}