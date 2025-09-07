import java.util.HashSet;

class D {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("kamal");
        set.add("saroj");
        set.add("vineet");
        set.add("rahul");
        set.add("gagan");
        
        System.out.println(set);
        //neither ordered nor sorted 
        //nor duplicates reocords are stored
    }
}