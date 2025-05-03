class U2 {
    public static void main(String[] args) {
        int[][] x = new int[3][];

        System.out.println(x);
        System.out.println(x.length);
        System.out.println("~~~~~~~~~~");
        System.out.println(x[0]);
        System.out.println(x[1][0]);
        System.out.println(x[2]);
    }    
}
/*[[I@4617c264
3
~~~~~~~~~~
null
Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local1>[1]" is null
        at U2.main(U2.java:9)
PS E:\JAVA\EXAMPLES\25_arrays> */