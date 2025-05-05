class P {
    public static void main(String[] args) {
        int[] x = {};
        int[][] y = {};
        int[][][] z = {};

        System.out.println(x instanceof int[]);
        System.out.println(x instanceof int[][]);
        System.out.println(x instanceof int[][][]);
        System.out.println(x instanceof String[]);
        System.out.println("~~~~");
        System.out.println(y instanceof int[]);
        System.out.println(y instanceof int[][]);
        System.out.println(y instanceof int[][][]);
        System.out.println(y instanceof String[][]);
        System.out.println("~~~~");
        System.out.println(z instanceof int[]);
        System.out.println(z instanceof int[][]);
        System.out.println(z instanceof int[][][]);
        System.out.println(z instanceof String[][][]);
    }    
}

/*P.java:8: error: incompatible types: int[] cannot be converted to int[][]
        System.out.println(x instanceof int[][]);
                           ^
P.java:9: error: incompatible types: int[] cannot be converted to int[][][]
        System.out.println(x instanceof int[][][]);
                           ^
P.java:10: error: incompatible types: int[] cannot be converted to String[]
        System.out.println(x instanceof String[]);
                           ^
P.java:12: error: incompatible types: int[][] cannot be converted to int[]
        System.out.println(y instanceof int[]);
                           ^
P.java:14: error: incompatible types: int[][] cannot be converted to int[][][]
        System.out.println(y instanceof int[][][]);
                           ^
P.java:15: error: incompatible types: int[][] cannot be converted to String[][]
        System.out.println(y instanceof String[][]);
                           ^
P.java:17: error: incompatible types: int[][][] cannot be converted to int[]
        System.out.println(z instanceof int[]);
                           ^
P.java:18: error: incompatible types: int[][][] cannot be converted to int[][]
        System.out.println(z instanceof int[][]);
                           ^
P.java:20: error: incompatible types: int[][][] cannot be converted to String[][][]
        System.out.println(z instanceof String[][][]);
                           ^
9 errors*/