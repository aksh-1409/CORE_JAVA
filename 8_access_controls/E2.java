class A1 {
    private int y = 919;

    void pro() {
        System.out.println(y);
    }
}


class E2 extends A1 {
   
    public static void main(String[] args) {
        
         E2 x = new E2();

        // System.out.println(x.y);

        x.pro();
    }
}
