abstract class X1 {
    abstract void aaa();    
}

class M {
    X1 r = new X1() {
        void aaa() {
            System.out.println("Hiiiiiiii");
        }
        
        void bbb() {
            System.out.println("Byeeeeee");
        }
    };

    public static void main(String[] args) {
        M m = new M();

        m.r.bbb();
    }
}

// M.java:19: error: cannot find symbol
//         m.r.bbb();
//            ^
//   symbol:   method bbb()
//   location: variable r of type X1
// 1 error