class D1 {
    public static void main(String[] args) {
        // pro(12);
        pro((short)12);
    }   
    
    static void pro(short x) {
        System.out.println(x);
    }
}




// D1.java:3: error: incompatible types: possible lossy conversion from int to short
//         pro(12);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error