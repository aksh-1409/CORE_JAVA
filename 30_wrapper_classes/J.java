class J {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(127);
        Integer b = Integer.valueOf(127);
        
        Integer c = Integer.valueOf(128);
        Integer d = Integer.valueOf(128);

        System.out.println(a == b);
        System.out.println(c == d);
    }    
}