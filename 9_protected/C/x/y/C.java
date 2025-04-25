package x.y;

class C {
    public static void main(String[] args) {
        B a = new B();

        System.out.println(a.x);
    }    
}


// x\y\C.java:7: error: x has protected access in A
//         System.out.println(a.x);
//                             ^
// 1 error