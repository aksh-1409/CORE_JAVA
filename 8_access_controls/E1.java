class A{
    private int y = 99;

    void pro(){
        System.out.println("Helooo Hiii...");
    }
}

class E1{
    public static void main(String[] args) {
        A x = new A();
     //   System.out.println(x.y);
        x.pro(); 
    }
}