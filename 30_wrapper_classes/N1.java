// commandline argument: 2.3

class N1 {
    public static void main(String[] args) {
        Float x = Float.parseFloat(args[0]);

        
        System.out.println(args[0] + 2);
        //unboxing
        System.out.println(x + 2);
    }    
}