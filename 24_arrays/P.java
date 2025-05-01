class P {
    public static void main(String[] args) {
        String[] x;
        x = {"ChotaBheem", "Raju", "Jaggu", "Chutki", "Kaliya", "Dholu", "Bholu", "Indumati", "TunTun Mausi" };

        System.out.println(x.length);

        for(int j=0; j<x.length; j++)
            System.out.println(x[j]);
    }    
}
/*P.java:4: error: illegal start of expression
        x = {"ChotaBheem", "Raju", "Jaggu", "Chutki", "Kaliya", "Dholu", "Bholu", "Indumati", "TunTun Mausi" };
            ^
P.java:4: error: not a statement
        x = {"ChotaBheem", "Raju", "Jaggu", "Chutki", "Kaliya", "Dholu", "Bholu", "Indumati", "TunTun Mausi" };
             ^
P.java:4: error: ';' expected
        x = {"ChotaBheem", "Raju", "Jaggu", "Chutki", "Kaliya", "Dholu", "Bholu", "Indumati", "TunTun Mausi" };
                         ^
3 errors*/