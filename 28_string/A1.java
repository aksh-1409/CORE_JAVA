class A1 {
    public static void main(String[] args) {
        String x = "mohan";
        String y = "mihan";

        String z = x.replace('o', 'i');
        String w = x.replace("o", "i");  
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(y==z);
        System.out.println(z==w);
    }    
}

//non pool multiple objects of string with same value of string will be created