class D {
    D() {
        System.out.println(this + " --- inside D Constructor");
    }   
    
    {
        System.out.println(this + " --- inside D init block");
    }

    public static void main(String[] args) {
        System.out.println("----main start");

        D x = new D();
        System.out.println(x + " --- inside D main method");

        System.out.println("----main end");
    }
}