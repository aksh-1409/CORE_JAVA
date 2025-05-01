class U2 {
    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};

        int[] y = new int[x.length];

        for(int next : y)
            System.out.println(next);

        int i=0,j=x.length-1;    
        while(i < x.length)
            y[i++] = x[j--];

        System.out.println("~~~~~~~~~~~~~~~~~");    

        for(int next : y)
            System.out.println(next + " ^");        
    }    
}