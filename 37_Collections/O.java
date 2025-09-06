import java.util.ArrayList;

class O {
    public static void main(String[] args) {
        Integer[] y = new Integer[2];
        
        // Generics: Compile-time safety... will be erased after compilation
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        // non-type-safe operations are rejected at compile time
        x.add("mohan");
        x.add(23);
        x.add(23.5);
        x.add(9);
        x.add(true);

        // Type-casting is exempted
        Integer z = x.get(2);
    } 
}