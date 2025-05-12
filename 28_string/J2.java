class J2 {
    public static void main(String[] args) {
        String x = "mohan is a good boy";

        String[] y = x.split("ah");

        System.out.println(y.length);
        System.out.println(y[0].length());
        

        for(String next : y)
            System.out.println(">"+next+"<");
    }    
}