abstract class X1 {
    abstract void aaa();    
}

class N {
    X1 r = new X1() {
        void aaa() {
            System.out.println("Hiiiiiiii");
            bbb();
        }
        
        void bbb() {
            System.out.println("Byeeeeee");
        }
    };

    public static void main(String[] args) {
        N m = new N();

        m.r.aaa();

        // m.r.bbb();
    }
}