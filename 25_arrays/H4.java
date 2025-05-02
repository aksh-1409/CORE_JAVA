class H4{
    public static void main(String[] args) {
        Animal[] x = new Dog[2];

        x[0] = new Dog();
        x[1] = new Animal();
    }   
}

/*Exception in thread "main" java.lang.ArrayStoreException: Animal
        at H4.main(H4.java:6)*/