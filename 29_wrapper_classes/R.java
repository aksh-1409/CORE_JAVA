class R {
    public static void main(String[] args) {
        System.out.println(pro());
    }   
    
    static Byte pro() {
        // return 2; //ok
        return 128;  // not ok
    }
}