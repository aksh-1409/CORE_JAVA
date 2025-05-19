
class S2 {
    public static void main(String[] args) {
        int a = 23;

        String b = Integer.toString(a);

         System.out.println(a instanceof int);
        System.out.println(b instanceof String);

        System.out.println(a + 2);
        System.out.println(b + 2);
    }    
}

/*S2.java:8: error: unexpected type
         System.out.println(a instanceof int);
                            ^
  required: reference
  found:    int
S2.java:8: error: unexpected type
         System.out.println(a instanceof int);
                                         ^
  required: class or array
  found:    int
2 errors*/