interface DD{

}

class C1{
    public static void main(String[] args) {
        DD a = new DD();
    }
}

/*C1.java:7: error: DD is abstract; cannot be instantiated
        DD a = new DD();
               ^
1 error*/