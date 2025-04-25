interface Y5{
    /*public static*/ void pro(); // interface method is implicitly public abstract
}

class N3 implements Y5{
    public void pro() { // you must define such inherited method inside your implimentor class along with the access modifier.
        
     }
}