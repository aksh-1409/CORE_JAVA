class C {
    C() {
        System.out.println(x + " --- inside main");
    }   
    
    {
        System.out.println(x + " --- inside main");
    }

    public static void main(String[] args) {
        System.out.println("----main start");

        C x = new C();
        System.out.println(x + " --- inside main");

        System.out.println("----main end");
    }
}

/*C.java:3: error: cannot find symbol
        System.out.println(x + " --- inside main");
                           ^
  symbol:   variable x
  location: class C
C.java:7: error: cannot find symbol
        System.out.println(x + " --- inside main");
                           ^
  symbol:   variable x
  location: class C
2 errors*/