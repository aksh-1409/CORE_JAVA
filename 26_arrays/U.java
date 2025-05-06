class U {
    public static void main(String[] args) {
        // int[][] a = new int[2];
        // int[] b = new int[3][4];
        //--------------------------
        int[][] c = {12, 34, 56};
        int[] d = {{12}};
        --------------------------
        int[] x = {new int[2], new int[3]};
    }    
}

/*U.java:3: error: incompatible types: int[] cannot be converted to int[][]
        int[][] a = new int[2];
                    ^
U.java:4: error: incompatible types: int[][] cannot be converted to int[]
        int[] b = new int[3][4];
                  ^
2 errors*/

/*U.java:9: error: '.class' expected
        int[] x = {new int[2], new int[3]};
              ^
U.java:9: error: illegal start of expression
        int[] x = {new int[2], new int[3]};
                  ^
U.java:9: error: not a statement
        int[] x = {new int[2], new int[3]};
                   ^
U.java:9: error: ';' expected
        int[] x = {new int[2], new int[3]};
                             ^
U.java:9: error: not a statement
        int[] x = {new int[2], new int[3]};
                               ^
U.java:9: error: ';' expected
        int[] x = {new int[2], new int[3]};
                                         ^
6 errors*/