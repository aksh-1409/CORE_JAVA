class L {
    public static void main(String[] args) {
        int[] x = {45, 62, 97, 23, 41, 22, 81, 16};

        int i;
        for(i=0;i<x.length;i++);            
            System.out.println(x[i]);
    }    
}

/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
        at L.main(L.java:7)*/