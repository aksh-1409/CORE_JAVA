class R {
    public static void main(String[] args) {
        String[] x = {"ChotaBheem", "Raju", "Jaggu", "Chutki", "Kaliya", "Dholu", "Bholu", "Indumati", "TunTun Mausi"};

        System.out.println(x.length);

        // Classic For Loop
        // for(int j=0; j<x.length; j++)
        //     System.out.println(x[j]);

        // Enhanced For Loop
        for(String next : x)
            System.out.println(next + " ^");

    }    
}