class E {
    static void pro(Car car) {
        System.out.println("Car parameterized method");
    }

    static void pro(SportsCar scar) {
        System.out.println("SportsCar parameterized method");
    }

    public static void main(String[] args) {
        Car x = new SportsCar();

        pro(x);
    }    
}

class Car { 

}

class SportsCar extends Car {

}