class V {
    public static void main(String[] args) {
        Object x = true;
        Object y = 2.3;
        Object z = 23;
        Object a = 'A';

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }    
}

/*V.java:5: error: integer number too large
        Object z = 2147483648;
                   ^
1 error

V.java:5: error: integer number too large
        int z = 2147483648;
                ^
1 error

*/

