class H3{
    public static void main(String[] args) {
        Animal[] x = new Dog[2];

        x[0] = new Dog();
        x[1] =(Dog) new Animal();
    }   
}

/*Exception in thread "main" java.lang.ClassCastException: class Animal cannot be cast to class Dog (Animal and Dog are in unnamed module of loader 'app')
        at H2.main(H2.java:6)*/