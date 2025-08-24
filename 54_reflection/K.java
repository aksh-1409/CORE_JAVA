import java.lang.reflect.Field;

class K {
    public static void main(String[] args) {
        Class klass =Student1.class;

        Field[] arr = klass.getDeclaredFields();

        for(Field next : arr)
            System.out.println(next.getName());
    }    
}