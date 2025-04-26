class YY2 {
    YY2(int a) {
        System.out.println("Hello");
    }
}

class V3 extends YY2 {

    V3() {
        super(2);
    }

    public static void main(String[] args) {
        System.out.println("A");
        V3 x = new V3();
        System.out.println("B");
    }    
}
