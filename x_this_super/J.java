class Y {
    static int m = 2;
}

class J extends Y {
    static int m = 3;

    void pro() {
        int m = 4;
        System.out.println(m);
        System.out.println(this.m);
        System.out.println(super.m);
    }

    public static void main(String[] args) {
        J x = new J();
        x.pro();
    }
}