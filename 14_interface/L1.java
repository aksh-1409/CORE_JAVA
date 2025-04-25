interface Y2{
    int a = 91;
}

class L1 {
    public static void main(String[] args) {
        System.out.println(Y2.a);  // variable a is implicitly static ... 
  
    Y2.a = 100; // interface variables are implicitly final...
    
    System.out.println(Y2.a);  // variable a is implicitly static ...
    }
}

/*L1.java:9: error: cannot assign a value to final variable a
    Y2.a = 100; // interface variables are implicitly final...
      ^
1 error*/