class F1 {
    F1() {
        System.out.println("XYZ");
        System.out.println("AAA");
    }    

    F1(int y) {
        System.out.println("XYZ");
        System.out.println("BBB");
    }    

    F1(int y, float w) {
        System.out.println("XYZ");
        System.out.println("CCC");
    }    

    public static void main(String[] args) {
        F1 a = new F1();
        F1 b = new F1(12);
        F1 c = new F1(12, 3.4f);
    }
}