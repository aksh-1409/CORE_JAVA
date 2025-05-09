class D1 {
    D1() {
        System.out.println(this + " --- inside D Constructor");
    }   
    
    {
        System.out.println(this + " --- inside D init block");
    }

    public static void main(String[] args) {
        System.out.println("----main start");

        D1 x = new D1();
        System.out.println(this + " --- inside D main method");

        System.out.println("----main end");
    }
}

/*D1.java:15: error: non-static variable this cannot be referenced from a static context
        System.out.println(this + " --- inside D main method");        
                           ^
1 error*/