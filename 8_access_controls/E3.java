class A2 {
    private int y = 52;

    int pro() {
        // System.out.println(y);
        return y;
    }
}

class E3 {
    public static void main(String[] args) {
        A2 x = new A2();

        // System.out.println(x.y);

        int w = x.pro();

        System.out.println(w);
    }
}