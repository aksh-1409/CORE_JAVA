class F {
    public static void main(String[] args) {
        int[][][] x = new int[3][4][2];

        /*

        calculation of the no. of arrays and the no. entires

        1 - 3d array
        3 - 2d array
        12(4*3) - 1d array
        24(2*12) - int variable (entries to be stored)main to yhi pe value store honghi kyunki baki k upr wale to referrnce variable h use to reffernce code store main jo value store hoat h 3 d array me voh to yhi pe hogha .
         */
        System.out.println(x);
        System.out.println("~~~~~~~~~~");
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println("~~~~~~~~~~");
        System.out.println(x[0][0]);
        System.out.println(x[0][1]);
        System.out.println(x[0][2]);
        System.out.println("~~~~~~~~~~");
        System.out.println(x[0][0][0]);
        System.out.println(x[0][0][1]);
    }    
}