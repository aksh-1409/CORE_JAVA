class Y {
    public static void main(String[] args) {
        Byte a = Byte.valueOf((byte)45);

        // autoboxing: unboxing --> a.byteValue()
        pro(a);

        System.out.println(a);
    }   
    
    static void  pro(byte x) {  
        System.out.println(x);
    }
}