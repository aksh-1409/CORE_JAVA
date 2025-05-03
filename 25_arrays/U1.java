class U1 {
    public static void main(String[] args) {
        int[][] x = new int[3][0];

        System.out.println(x);
        System.out.println(x.length);
        System.out.println("~~~~~~~~~~");
        System.out.println(x[0].length);
        System.out.println(x[1].length);
        System.out.println(x[2].length);
        System.out.println("~~~~~~~~~~");
        System.out.println(x[0][0]);
    }    
}

/*[[I@4617c264
3
~~~~~~~~~~
0
0
0
~~~~~~~~~~
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at U1.main(U1.java:12)*/