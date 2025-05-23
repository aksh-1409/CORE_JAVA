class H {
    public static void main(String[] args) {
        System.out.println("start");

        Animal a = new Cat();

        try {
            Dog b = (Dog)a;
        } catch(ClassCastException e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}


class Animal {}
class Cat extends Animal {}
class Dog extends Animal {}

/*start
java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
end*/