class AAA {
    AAA() {
        //Compiler provided super no argument call...
        //super();
        System.out.println("Namaste Ji");
    }
}

class K extends AAA {
    // Compiler Supplied constructor(Default Constructor)
    // K() {
    //     super();
    // }
    public static void main(String[] args) {
        System.out.println("---- main start");
        K t = new K();
        System.out.println("---- main end");
    }
}