class Q1{

    public static void main(String[] args) {
        final int j; //uninialized final local variable j. 

        j = 29; // initialization of final local variable j is allowed.

        System.out.println(j);

        j= 78; //reinitialization of final local variable j is not allowed.
    }
}

/*Q1.java:10: error: variable j might already have been assigned
        j= 78; //reinitialization of final local variable j is not allowed.
        ^
1 error*/