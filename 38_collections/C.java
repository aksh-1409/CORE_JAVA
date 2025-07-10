import java.util.Arrays;
import java.util.List;

class C{
    public static void main(String[] args){
        Integer[] x = {12, 56, 78};

        List<Integer> list = Arrays.asList(x);

          
            for(Integer next:x){
                System.out.println(next);
            }
        


        // for(Integer[] x: list){
        //     for(Integer next:x){
        //         System.out.println(next);
        //     }
        // }

        System.out.println(list);
    }
}